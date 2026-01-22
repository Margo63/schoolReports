package com.example.database.repositories;

import com.example.database.enteties.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
