package com.kuaibao.dao;

import com.kuaibao.entity.User;

import java.util.List;

public interface IUserDAO {

    int add(User user);

    int update(User user);

    int delete(int id);

    User findUserById(int id);

    List<User> findUserList();
}
