package com.world_weather.world_weather.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage <T>{
    private int code;
    private String message;
    private T data;

    public ResponseMessage(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    //接口请求成功
    public static  <T>ResponseMessage success(T data) {
        return new ResponseMessage(HttpStatus.OK.value(), "success", data);
    }

    //接口请求成功
    public static  <T>ResponseMessage success() {
        return new ResponseMessage(HttpStatus.OK.value(), "success", null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
