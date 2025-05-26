package com.world_weather.world_weather.mapper;

import com.world_weather.world_weather.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends CrudRepository<User, Integer> {
}
