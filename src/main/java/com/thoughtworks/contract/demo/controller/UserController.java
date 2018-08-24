package com.thoughtworks.contract.demo.controller;

import com.thoughtworks.contract.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user = new User(1,"zhangsan");
        users.add(user);
        return users;
    }
}
