package com.ks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
