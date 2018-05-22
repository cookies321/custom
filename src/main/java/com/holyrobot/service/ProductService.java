package com.holyrobot.service;

import com.holyrobot.bean.CusCusinfo;
import com.holyrobot.bean.CusScenicspot;
import com.holyrobot.bean.OmDestination;

import javax.print.attribute.standard.Destination;
import java.util.List;

/**
 * @author 赵乐
 * @create 2018-05-1614:30
 * @desc 定制游需求service
 **/
public interface ProductService {

    //获取所有目的地
    List<OmDestination> getAllDestionList();
    //新增景区
    void saveScenicSpot(CusScenicspot cusScenicspot);

    void deleteScenincSpot(String id);
    //查询景区表
    List<CusScenicspot> getScenicSpotList(Integer pageNum, Integer pageSize, String scenicName, String destinationID);

    //获取条数
    Integer getCountScenicSpot(String scenicName, String destinationID);
}
