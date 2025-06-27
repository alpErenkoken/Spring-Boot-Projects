package com.example.userwork.controller;

import com.example.userwork.Dto.ProjectDto;
import com.example.userwork.Dto.UserDto;
import com.example.userwork.objects.Projects;
import com.example.userwork.objects.User;
import com.example.userwork.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("projects")
public class ProjectsController
{

    @Autowired
    ProjectsService projectsService;


    @GetMapping("allProjects")
    public ResponseEntity<List<ProjectDto>> getAllProjects()
    {
        return projectsService.getAllProjects();
    }
    @PostMapping("add")
    public ResponseEntity<String> addProject(@RequestBody Projects project)
    {
        return projectsService.addProject(project);
    }
    @GetMapping("projectsForUser")
    public ResponseEntity<List<ProjectDto>> getProjectForUsers(@RequestParam String username)
    {
        return projectsService.getProjectForUsers(username);
    }

}
