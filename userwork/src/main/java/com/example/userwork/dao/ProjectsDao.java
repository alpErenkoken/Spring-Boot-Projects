package com.example.userwork.dao;

import com.example.userwork.objects.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsDao extends JpaRepository<Projects,Integer>
{


}
