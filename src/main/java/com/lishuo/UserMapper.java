package com.lishuo;

import com.mybatis.Param;
import com.mybatis.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where name = #{name} and age = #{age}")
    public List<User> getUser(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from user where id = #{id}")
    public User getUserById(@Param("id") Integer id);

}
