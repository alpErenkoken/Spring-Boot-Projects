package com.example.userwork.service;

import com.example.userwork.Dto.Mapper;
import com.example.userwork.Dto.UserDto;
import com.example.userwork.dao.UserDao;
import com.example.userwork.objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{

    @Autowired
    UserDao userDao;


    public ResponseEntity<List<UserDto>> getAllUsers()
    {
        List<UserDto> userDtoList= new ArrayList<>();

        Mapper mapper = new Mapper();
        for(User user:userDao.findAll())
        {
            userDtoList.add(mapper.userToUserDTO(user));
        }

        return new ResponseEntity<>(userDtoList, HttpStatus.OK);
    }

    public ResponseEntity<String> addUser(User user)
    {
        userDao.save(user);
        return new ResponseEntity<>("User "+user.getName()+" has successfully added",HttpStatus.OK);
    }


}
