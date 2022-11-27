package com.ks.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ks.entities.Users;
import com.ks.model.UserRequest;
import com.ks.services.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    ResponseEntity<String> responseEntity(@RequestBody UserRequest userRequest) {
    	userService.saveUser(userRequest);
        return new ResponseEntity<String>("User successfully registered!", HttpStatus.OK);
    }
    
    @GetMapping("/signin")
    Users gatuser(@RequestParam String username, @RequestParam String password) {
    	Users user = userService.getUser(username, password);
        return user;
    			
    }

}
