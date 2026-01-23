package com.example.kubernetes.service;

import com.example.kubernetes.model.User;

import java.util.Collection;

public interface UserService {

    User createUser(User user);
    Collection<User> getAllUsers();
}
