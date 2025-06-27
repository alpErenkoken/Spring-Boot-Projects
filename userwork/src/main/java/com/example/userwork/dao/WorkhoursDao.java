package com.example.userwork.dao;

import com.example.userwork.objects.Workhours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkhoursDao extends JpaRepository<Workhours,Integer>
{

}
