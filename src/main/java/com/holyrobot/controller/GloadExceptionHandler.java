package com.holyrobot.controller;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 赵乐
 * @create 2018-05-1115:41
 * @desc 配置全局异常处理
 **/
@ControllerAdvice
@Slf4j
public class GloadExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,String> exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
        Map<String,String> map=new HashMap<>();
        map.put("url",request.getRequestURL().toString());
        map.put("code",response.getStatus()+"");
        map.put("message",exception.getMessage());
        /*log.info(request.getRequestURL().toString());
        log.info(response.getStatus()+"");
        log.info(exception.getMessage());*/
        return map;
    }

}
