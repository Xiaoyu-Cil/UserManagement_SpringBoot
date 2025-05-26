package com.world_weather.world_weather.controller;

import com.world_weather.world_weather.pojo.ResponseMessage;
import com.world_weather.world_weather.pojo.User;
import com.world_weather.world_weather.pojo.dto.UserDto;
import com.world_weather.world_weather.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //接口方法返回对象，转换成json文本
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    //add
    @PostMapping
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user) {
        User userNew = userService.addUser(user);
        return ResponseMessage.success(userNew);
    }

    //get
    @GetMapping("/{userId}")
    public ResponseMessage get(@PathVariable Integer userId) {
        User userNew = userService.getUserById(userId);
        return ResponseMessage.success(userNew);
    }

    //update
    @PutMapping
    public ResponseMessage<User> update(@Validated @RequestBody UserDto user) {
        User userNew = userService.updateUser(user);
        return ResponseMessage.success(userNew);
    }


    //delete
    @DeleteMapping("/{userId}")
    public ResponseMessage<Void> deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);  // service 层处理删除逻辑
        return ResponseMessage.success();  // 通用无内容响应
    }

}
