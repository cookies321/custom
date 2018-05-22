package com.holyrobot.service;

import com.holyrobot.bean.CusCusinfo;

import java.util.List;

/**
 * @author 赵乐
 * @create 2018-05-1614:30
 * @desc 定制游需求service
 **/
public interface CustomDemandService {

    //保存定制游需求表以及附带表
    void saveCustomDemand(CusCusinfo cusinfo);
    //查询定制游需求表
    List<CusCusinfo> getCusCusinfoList(Integer pageNum,Integer pageSize, String datemin,String datemax,String travellername);

    //获取
    Integer getCountCustomDemeand(String datemin,String datemax,String travellername);
}
