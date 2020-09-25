package com.example.demo.services;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    void createUser(User user);
}