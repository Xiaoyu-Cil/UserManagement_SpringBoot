package com.world_weather.world_weather.pojo;

import jakarta.persistence.*;

@Table(name="tb_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer UserId;
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String Password;
    @Column(name="email")
    private String Email;

    public User() {
    }

    public User(Integer userId, String userName, String password, String email) {
        UserId = userId;
        this.userName = userName;
        Password = password;
        Email = email;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
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

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + userName + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
