package com.example.demo.controller;

import com.example.demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final UserService userService;

    public PageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getIndexPage(Model model){
        model.addAttribute("users", userService.findAllUsers());
        return "index";
    }

}
