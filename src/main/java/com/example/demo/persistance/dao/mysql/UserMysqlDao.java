package com.example.demo.persistance.dao.mysql;

import com.example.demo.model.User;
import com.example.demo.persistance.dao.UserDAO;
import com.example.demo.persistance.dao.query.UserQuery;
import com.example.demo.persistance.mapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserMysqlDao implements UserDAO {

    private final JdbcTemplate jdbcTemplate;

    public UserMysqlDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createUser(User user) {
        jdbcTemplate.update(UserQuery.CREATE_USER, user.getId(), user.getUserName(), user.getPassword());

    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query(UserQuery.USER_LIST, new UserRowMapper());
    }
}
