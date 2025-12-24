package com.MakeMyTrip.MakeMyTrip.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MakeMyTrip.MakeMyTrip.Services.UserService;
import com.MakeMyTrip.MakeMyTrip.models.Users;

@RestController
@RequestMapping("/user")

public class UserController {
    
    @Autowired
    private UserService userServices;
    
    @PostMapping("/login")
    public Users login(@RequestParam String email, @RequestParam String password) {
        return userServices.login(email, password);
    }
    @PostMapping("/signup")
    public ResponseEntity<Users> signup(@RequestBody Users user) {
        return ResponseEntity.ok(userServices.signup(user));
    }
}