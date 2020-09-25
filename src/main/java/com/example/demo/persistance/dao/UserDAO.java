package com.example.demo.persistance.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);

    List<User> getAllUsers();
}
