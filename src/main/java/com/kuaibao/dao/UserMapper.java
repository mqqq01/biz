package com.kuaibao.dao;

import com.kuaibao.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,age) values (#{name},#{age})")
    int add(@Param("name") String name, @Param("age") int age);

    @Update("update user set name = #{name}, age = #{age} where id = #{id}")
    int update(@Param("name") String name, @Param("age") int age, @Param("id") int id);

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);
}
