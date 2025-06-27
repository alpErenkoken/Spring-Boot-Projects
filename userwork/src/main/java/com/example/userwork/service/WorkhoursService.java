package com.example.userwork.service;

import com.example.userwork.Dto.Mapper;
import com.example.userwork.Dto.WorkhoursDto;
import com.example.userwork.dao.WorkhoursDao;
import com.example.userwork.objects.Workhours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkhoursService
{
    @Autowired
    WorkhoursDao workhoursDao;


    public ResponseEntity<List<WorkhoursDto>> getAllWorkHours()
    {
        List<WorkhoursDto> workhoursList= new ArrayList<>();

        Mapper mapper = new Mapper();
        for(Workhours workhours:workhoursDao.findAll())
        {
            workhoursList.add(mapper.workhoursToworkhoursDto(workhours));
        }
        return new ResponseEntity<>(workhoursList, HttpStatus.OK);
    }

    public ResponseEntity<String> addWorkHours(Workhours workhours)
    {
        workhoursDao.save(workhours);
        return new ResponseEntity<>("New Workhours "+workhours.getWorkHours()+" has added.",HttpStatus.OK);
    }


}
