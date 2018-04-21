package com.kuaibao.service.impl;

import com.kuaibao.dao.IUserDAO;
import com.kuaibao.entity.User;
import com.kuaibao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO userDAO;

    @Override
    public int add(User user) {
        return userDAO.add(user);
    }

    @Override
    public int update(User user) {
        return userDAO.update(user);
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public List<User> findUserList() {
        return null;
    }
}
