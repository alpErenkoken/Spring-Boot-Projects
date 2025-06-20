package com.alperen.firstProject.dao;

import com.alperen.firstProject.objects.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
