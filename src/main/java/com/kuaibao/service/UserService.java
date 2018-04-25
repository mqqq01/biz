package com.kuaibao.service;

import com.kuaibao.dao.UserMapper;
import com.kuaibao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public int add(String name, int age){
        return userMapper.add(name,age);
    }

    public int update(String name, int age, int id){
        return userMapper.update(name,age,id);
    }

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}
