package com.example.userwork.controller;

import com.example.userwork.Dto.UserProjectDto;
import com.example.userwork.objects.UsersProjects;
import com.example.userwork.service.UsersProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usersProjects")
public class UsersProjectsController
{

    @Autowired
    UsersProjectsService usersProjectsService;


    @GetMapping("allUsersProjects")
    public ResponseEntity<List<UserProjectDto>> getAllUsersProjects()
    {
        return usersProjectsService.getAllUsersProjects();
    }
    @PostMapping("add")
    public ResponseEntity<String> addUsersProjects(@RequestBody UsersProjects usersProjects)
    {
        return usersProjectsService.addUsersProjects(usersProjects);
    }



}
