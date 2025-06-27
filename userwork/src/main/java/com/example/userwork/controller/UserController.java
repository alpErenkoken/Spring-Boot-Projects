package com.example.userwork.controller;

import com.example.userwork.Dto.UserDto;
import com.example.userwork.objects.User;
import com.example.userwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController
{

    @Autowired
    UserService systemService;


    @GetMapping("allUsers")
    public ResponseEntity<List<UserDto>> getAllUsers()
    {
        return systemService.getAllUsers();
    }
    @PostMapping("add")
    public ResponseEntity<String> addUser(@RequestBody User user)
    {
        return systemService.addUser(user);
    }


}
