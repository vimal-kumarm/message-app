package com.example.messaging.controller;
import com.example.messaging.entity.User;
import com.example.messaging.service.UserService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class UserController{
 private final UserService service;
 public UserController(UserService service){this.service=service;}
 @PostMapping("/register")
 public User register(@RequestBody User user){return service.register(user);}
}