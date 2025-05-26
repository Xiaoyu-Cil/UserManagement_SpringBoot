package com.world_weather.world_weather.service;

import com.world_weather.world_weather.mapper.UserMapper;
import com.world_weather.world_weather.pojo.User;
import com.world_weather.world_weather.pojo.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //配置成spring的bean
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User addUser(UserDto user){

        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);

        userMapper.save(userPojo);
        //调用数据访问类
        return userPojo;
    }

    @Override
    public User getUserById(Integer userId) {
        return userMapper.findById(userId).orElseThrow(() -> {
            throw new IllegalArgumentException("User doesn't exist!");
        });

    }

    @Override
    public User updateUser(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);

        return userMapper.save(userPojo);
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteById(userId);
    }




}
