package com.example.userwork.service;

import com.example.userwork.Dto.Mapper;
import com.example.userwork.Dto.UserProjectDto;
import com.example.userwork.dao.UsersProjectsDao;
import com.example.userwork.objects.UsersProjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersProjectsService
{
    @Autowired
    UsersProjectsDao usersProjectsDao;


    public ResponseEntity<List<UserProjectDto>> getAllUsersProjects()
    {
        List<UserProjectDto> userProjectDtoList= new ArrayList<>();

        Mapper mapper = new Mapper();
        for(UsersProjects usersProjects:usersProjectsDao.findAll())
        {
            userProjectDtoList.add(mapper.userProjectTouserProjectDTO(usersProjects));
        }
        return new ResponseEntity<>(userProjectDtoList, HttpStatus.OK);
    }
    public ResponseEntity<String> addUsersProjects(UsersProjects usersProjects)
    {
        usersProjectsDao.save(usersProjects);
        return new ResponseEntity<>("Project "+usersProjects.getProjectId()+" has added.",HttpStatus.OK);
    }


}
