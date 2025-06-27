package com.example.userwork.Dto;

import com.example.userwork.objects.Projects;
import com.example.userwork.objects.User;
import com.example.userwork.objects.UsersProjects;
import com.example.userwork.objects.Workhours;

public class Mapper {
    public UserDto userToUserDTO(User u) {
        return new UserDto.Builder()
                .id(u.getId())
                .name(u.getName())
                .build();
    }

    public ProjectDto projectToProjectDTO(Projects project) {
        return new ProjectDto.Builder()
                .id(project.getId())
                .name(project.getName())
                .build();
    }

    public UserProjectDto userProjectTouserProjectDTO(UsersProjects up) {
        return new UserProjectDto.Builder()
                .userId(up.getUserId())
                .projectId(up.getProjectId())
                .build();
    }

    public WorkhoursDto workhoursToworkhoursDto(Workhours workhours)
    {
        return new WorkhoursDto.WorkhoursDtoBuilder()
                .id(workhours.getId())
                .workhours(workhours.getWorkHours())
                .build();
    }

}
