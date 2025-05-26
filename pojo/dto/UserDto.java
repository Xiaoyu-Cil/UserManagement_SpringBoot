package com.world_weather.world_weather.pojo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDto {
    private Integer userId;

    @NotBlank(message = "Username cannot be empty.")
    private String userName;
    @NotNull(message = "Password cannot be empty.")
    @Size(min = 3, max = 15, message = "The length of password should between 3-15 bytes.")
    private String Password;
    @Email(message = "The entered email is invalid.")
    private String Email;

    public UserDto() {
    }

    public UserDto(String userName, String password, String email) {
        this.userName = userName;
        Password = password;
        Email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
