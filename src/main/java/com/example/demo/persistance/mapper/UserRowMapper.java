package com.example.demo.persistance.mapper;

import com.example.demo.model.User;
import com.example.demo.persistance.dao.query.UserQuery;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();

        user.setId(resultSet.getLong(UserQuery.ID));
        user.setUserName(resultSet.getString(UserQuery.USERNAME));
        user.setPassword(resultSet.getString(UserQuery.USER_PASSWORD));

        return user;
    }
}
