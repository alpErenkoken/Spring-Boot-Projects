package com.example.userwork.objects;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "projects")
@Data
public class Projects
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    @Column(name="startdate")
    private String startDate;

    @Column(name="enddate")
    private String endDate;

    @Column(name="responsibleuser")
    private String responsibleUser;

}
