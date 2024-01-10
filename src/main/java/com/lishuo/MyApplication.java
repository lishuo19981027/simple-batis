package com.lishuo;

import com.mybatis.MapperProxyFactory;

import java.util.List;

public class MyApplication {

    public static void main(String[] args) {

        UserMapper userMapper = MapperProxyFactory.getMapper(UserMapper.class);
        List<User> result = userMapper.getUser("lishuo",100);
        System.out.println(result);
        User user = userMapper.getUserById(2);
        System.out.println(user);
        //userMapper.getUserById();
    }
}
