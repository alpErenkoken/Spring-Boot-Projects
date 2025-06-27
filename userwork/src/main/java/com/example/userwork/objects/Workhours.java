package com.example.userwork.objects;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="work_hours")
@Data
public class Workhours
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="userid")
    private int userId;

    @Column(name="projectid")
    private int projectId;

    @Column(name="workdate")
    private String workDate;

    @Column(name="workhours")
    private double workHours;

    @Column(name="notes")
    private String notes;

}
