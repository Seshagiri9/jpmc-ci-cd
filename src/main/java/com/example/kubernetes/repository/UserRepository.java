package com.example.kubernetes.repository;


import com.example.kubernetes.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private final Map<Long, User> store = new HashMap<>();

    public User save(User user) {
        store.put(user.getId(), user);
        return user;
    }

    public Collection<User> findAll() {
        return store.values();
    }
}
