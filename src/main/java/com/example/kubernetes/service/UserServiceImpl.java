package com.example.kubernetes.service;

import com.example.kubernetes.model.User;
import com.example.kubernetes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User createUser(User user) {

        return repository.save(user);
    }

    @Override
    public Collection<User> getAllUsers() {

        return repository.findAll();
    }
}
