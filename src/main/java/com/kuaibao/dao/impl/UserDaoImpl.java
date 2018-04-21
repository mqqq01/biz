package com.kuaibao.dao.impl;

import com.kuaibao.dao.IUserDAO;
import com.kuaibao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        return jdbcTemplate.update("insert into user (name,age) values (?,?)",user.getName(),user.getAge());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("update user set name = ? ,age = ? ,sex = ? where id = ?",user.getName(),user.getAge(),user.getSex(),user.getId());
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
