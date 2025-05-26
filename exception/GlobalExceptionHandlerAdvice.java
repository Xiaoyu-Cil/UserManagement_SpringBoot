package com.world_weather.world_weather.exception;

import com.world_weather.world_weather.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler({Exception.class})
    public ResponseMessage handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
        log.error("Global Exception: ", e);
        return new ResponseMessage<>(500, "error", "null");
    }
}
