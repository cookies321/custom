package com.holyrobot.controller;

import com.holyrobot.bean.CusCusinfo;
import com.holyrobot.common.bo.Page;
import com.holyrobot.common.bo.Response;
import com.holyrobot.service.CustomDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author 赵乐
 * @create 2018-05-1614:28
 * @desc 定制游需求接口类
 **/
@RestController
public class CustomDemandController {
    @Autowired
    private CustomDemandService customDemandService;


    //保存定制游需求单信息
    @RequestMapping("/saveCustomDemand")
    public  Response saveCustomDemand(@RequestBody CusCusinfo cusinfo){
        Response response = new Response();
        customDemandService.saveCustomDemand(cusinfo);
        return response.success();
    }


    //根据条件信息查询定制游需求信息条数
    @RequestMapping(value = "/getCountCustomDemand")
    public Response getCountCustomDemand(String datemin, String datemax, String travellername){
        Response response = new Response();
        Integer countCustomDemeand = customDemandService.getCountCustomDemeand(datemin,datemax,travellername);
        return response.success(countCustomDemeand);
    }

    //根据条件信息查询定制游需求信息
    @RequestMapping(value = "/getAllCustomDemand")
    public Response getAllCustomDemand(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10")Integer pageSize,
                                       String datemin, String datemax, String travellername){
        Response response = new Response();
        List<CusCusinfo> cusCusinfoList = customDemandService.getCusCusinfoList(pageNum,pageSize,datemin,datemax,travellername);
        return response.success(cusCusinfoList);
    }

}
