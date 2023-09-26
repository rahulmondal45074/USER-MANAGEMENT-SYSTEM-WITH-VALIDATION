package com.example.JobProject1;


import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    List<User> userList;


    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User> user){

        userList.addAll(user);
        return "users are added";

    }


    @GetMapping("users")
    public List<User> getAllUsers(){
        return userList;
    }

    @PutMapping("user/{id}")
    public  String updateUser(@PathVariable Integer id , @RequestParam String name){

        for( User user: userList){
            if( user.getUserId().equals(id)){
                user.setUserName(name);
                return "user"+id + "updated to "+ name;
            }
        }
        return "Invalid user id";
    }


    @DeleteMapping("user/{id}")
    public String removeUser(@PathVariable Integer id){

        for( User user : userList){
            if( user.getUserId().equals(id)){
                userList.remove(user);
                return "user"+id+" removed";
            }
        }
        return "Invalid user id";
    }

}
