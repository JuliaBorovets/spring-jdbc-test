package com.example.demo.persistance.dao.query;

public interface UserQuery {
    String TABLE_NAME = "user";
    String ID = "id";
    String USERNAME = "user_name";
    String USER_PASSWORD = "password";

    String CREATE_USER = "INSERT INTO " + TABLE_NAME + " (" +ID + "," +  USERNAME + "," + USER_PASSWORD + ")" +
            " VALUES(?,?,?)";

    String USER_LIST = "SELECT * FROM " + TABLE_NAME;
}
