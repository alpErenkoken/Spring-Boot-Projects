package com.example.userwork.dao;

import com.example.userwork.objects.UsersProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersProjectsDao extends JpaRepository<UsersProjects,Integer>
{

}
