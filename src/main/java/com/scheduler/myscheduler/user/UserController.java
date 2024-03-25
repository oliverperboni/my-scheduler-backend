package com.scheduler.myscheduler.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    
    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getUser();

    }


    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathParam("{id}") int id){
        
    }

    @PutMapping(path = "{id}")
    public void  updateUser(@PathParam("{id}")int id, String name){

    }


    @PostMapping
    public void addUser(@RequestBody User user){

    }



}   
