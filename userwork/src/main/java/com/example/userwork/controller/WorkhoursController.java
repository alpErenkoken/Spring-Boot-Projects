package com.example.userwork.controller;

import com.example.userwork.Dto.WorkhoursDto;
import com.example.userwork.objects.Workhours;
import com.example.userwork.service.WorkhoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workhours")
public class WorkhoursController
{

    @Autowired
    WorkhoursService workhoursService;


    @GetMapping("allWorkhours")
    public ResponseEntity<List<WorkhoursDto>> getAllWorkhours()
    {
        return workhoursService.getAllWorkHours();
    }
    @PostMapping("add")
    public ResponseEntity<String> addWorkhours(@RequestBody Workhours workhours)
    {
        return workhoursService.addWorkHours(workhours);
    }



}
