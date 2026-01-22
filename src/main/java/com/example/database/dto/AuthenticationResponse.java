package com.example.database.dto;

public class AuthenticationResponse {
    private String token;
    private String type = "Bearer";
    private String email;
    private String name;
    private Boolean isAdmin;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token, String email, String name, Boolean isAdmin) {
        this.token = token;
        this.email = email;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}