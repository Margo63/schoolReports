package com.example.database.service;

import com.example.database.dto.AuthenticationRequest;
import com.example.database.dto.AuthenticationResponse;
import com.example.database.enteties.User;
import com.example.database.repositories.UserRepository;
import com.example.database.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );

            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            User user = userRepository.findByEmail(request.getEmail())
                    .orElseThrow(() -> new BadCredentialsException("User not found"));

            Map<String, Object> extraClaims = new HashMap<>();
            extraClaims.put("isAdmin", user.getAdmin());
            extraClaims.put("name", user.getName());

            String token = jwtUtil.generateToken(userDetails, extraClaims);

            return new AuthenticationResponse(token, user.getEmail(), user.getName(), user.getAdmin());

        } catch (Exception e) {
            throw new BadCredentialsException("Invalid credentials", e);
        }
    }

    public User registerUser(User user) {
        // Check if user already exists
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        // Encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        // Save user
        return userRepository.save(user);
    }
}