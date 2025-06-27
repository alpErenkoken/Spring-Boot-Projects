package com.example.userwork.service;

import com.example.userwork.Dto.Mapper;
import com.example.userwork.Dto.ProjectDto;
import com.example.userwork.dao.ProjectsDao;
import com.example.userwork.objects.Projects;
import com.example.userwork.objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectsService
{
    @Autowired
    ProjectsDao projectsDao;


    public ResponseEntity<List<ProjectDto>> getAllProjects()
    {
        List<ProjectDto> projectDtoList= new ArrayList<>();

        Mapper mapper = new Mapper();
        for(Projects project:projectsDao.findAll())
        {
            projectDtoList.add(mapper.projectToProjectDTO(project));
        }

        return new ResponseEntity<>(projectDtoList, HttpStatus.OK);
    }
    public ResponseEntity<String> addProject(Projects project)
    {
        projectsDao.save(project);
        return new ResponseEntity<>("Project "+project.getName()+" has successfully added",HttpStatus.OK);
    }

    public ResponseEntity<List<ProjectDto>> getProjectForUsers(String username)
    {
        List<ProjectDto> projectDtoList= new ArrayList<>();
        List<Projects> projectList=new ArrayList<>();

        Mapper mapper = new Mapper();

        for(Projects project:projectsDao.findAll())
        {
            if(username.equals(project.getResponsibleUser()))
            {
                projectList.add(project);
            }
        }

        for(Projects project:projectList)
        {
            projectDtoList.add(mapper.projectToProjectDTO(project));
        }

        return new ResponseEntity<>(projectDtoList,HttpStatus.OK);

    }

}
