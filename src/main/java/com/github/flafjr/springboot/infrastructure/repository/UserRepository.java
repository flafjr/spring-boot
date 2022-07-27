package com.github.flafjr.springboot.infrastructure.repository;

import com.github.flafjr.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUserType(String name);
}  
