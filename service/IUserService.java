package com.world_weather.world_weather.service;

import com.world_weather.world_weather.pojo.User;
import com.world_weather.world_weather.pojo.dto.UserDto;

public interface IUserService {

    /**
     * 插入用户
     * @param user
     * @return
     */
    User addUser(UserDto user);

    /**
     * 查询用户
     * @param userId 用户id
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 修改用户
     * @param user 修改用户对象
     * @return
     */
    User updateUser(UserDto user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    void deleteUser(Integer userId);

}
