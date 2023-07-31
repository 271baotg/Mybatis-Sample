package com.example.mybatisfinal.mapper;


import com.example.mybatisfinal.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


@Mapper
public interface UserMapper {


    List<User> getAllUser();


    void addNewUser(String name,Integer age, Integer goals, String nationality);


    void updateGoal(Integer goals, Integer id);


    void deleteUser(String name);

    List<User> testSelectTop5GoalsByNation(String nation);

    Map<String,Object> testGetPlayerStats();
}
