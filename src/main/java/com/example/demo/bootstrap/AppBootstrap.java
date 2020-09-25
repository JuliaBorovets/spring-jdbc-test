package com.example.demo.bootstrap;

import com.example.demo.model.User;
import com.example.demo.persistance.dao.UserDAO;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Component
public class AppBootstrap implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) {
        loadSecurityData();
    }

    private void loadSecurityData() {
        User user = new User();
        user.setId(1L);
        user.setUserName("user");
        user.setPassword("password");

        User user1 = new User();
        user1.setId(2L);
        user1.setUserName("user1");
        user1.setPassword("password");

        User user2 = new User();
        user2.setId(3L);
        user2.setUserName("user2");
        user2.setPassword("password");

        User user3 = new User();
        user3.setId(4L);
        user3.setUserName("user3");
        user3.setPassword("password");

        User user4 = new User();
        user4.setId(5L);
        user4.setUserName("user4");
        user4.setPassword("password");

        userService.createUser(user);
        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);
        userService.createUser(user4);

    }
}
