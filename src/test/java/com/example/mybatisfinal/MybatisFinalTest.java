package com.example.mybatisfinal;


import com.example.mybatisfinal.mapper.UserMapper;
import com.example.mybatisfinal.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootTest
public class MybatisFinalTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect(){
        List<User> result = userMapper.getAllUser();
        result.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        userMapper.addNewUser("Jadon Sancho",26,6,"English");
    }

    @Test
    public void testUpdate(){
        userMapper.updateGoal(10,10);
    }

    @Test
    public void testDelete(){
        userMapper.deleteUser("Lionel Messi");
    }

    @Test
    public void testProcedure(){
        List<User> userList = userMapper.testSelectTop5GoalsByNation("Argentina");
        userList.forEach(System.out::println);
    }

    @Test
    public void testProcedure1(){
        Map<String, Object> resultMap = userMapper.testGetPlayerStats();

        System.out.println(resultMap.get("totalUsers"));
        System.out.println(resultMap.get("averageAge"));
        System.out.println(resultMap.get("maxGoals"));
    }
}
