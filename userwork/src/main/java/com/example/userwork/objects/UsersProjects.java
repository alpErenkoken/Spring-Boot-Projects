package com.example.userwork.objects;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users_projects")
@Data
public class UsersProjects
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="userid")
    private int userId;

    @Column(name="projectid")
    private int projectId;

    @Column(name="assigntime")
    private String assignTime;

}
