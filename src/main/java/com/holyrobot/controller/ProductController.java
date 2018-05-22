package com.holyrobot.controller;

import com.holyrobot.bean.CusCusinfo;
import com.holyrobot.bean.CusScenicspot;
import com.holyrobot.bean.OmDestination;
import com.holyrobot.common.bo.Page;
import com.holyrobot.common.bo.Response;
import com.holyrobot.common.utils.Pinyin4Util;
import com.holyrobot.service.CustomDemandService;
import com.holyrobot.service.ProductService;
import jdk.nashorn.internal.runtime.arrays.IteratorAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @author 赵乐
 * @create 2018-05-1614:28
 * @desc 产品接口类
 **/
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/deleteScenincSpot")
    public Response deleteScenincSpot(String id){
        Response response = new Response();
        productService.deleteScenincSpot(id);
        return response.success();
    }

    @RequestMapping("/saveScenicSpot")
    public Response getsaveScenicSpot(CusScenicspot cusScenicspot,String destination){
        Response response = new Response();
        String[] split = destination.split(",");
        if(split.length>1){
            cusScenicspot.setDestinationid(split[0]);
            cusScenicspot.setDestinationname(split[1]);
        }
        String scenicname = cusScenicspot.getScenicname();
        String pingyingName = Pinyin4Util.converterToSpell(scenicname);
        String[] split1 = pingyingName.split(",");
        cusScenicspot.setSpell(split1[0]);
        cusScenicspot.setCreateddate(new Date());
        cusScenicspot.setId(UUID.randomUUID().toString());
        productService.saveScenicSpot(cusScenicspot);
        return response.success();
    }

    //获取所有目的地信息
    @RequestMapping("/getAllDestionList")
    public Response getAllDestionList(){
        Response response = new Response();
        List<OmDestination> allDestionList = productService.getAllDestionList();
        return response.success(allDestionList);
    }

    //根据条件查询景点信息条数
    @RequestMapping(value = "/getcountCusScenicspot")
    public Response getcountCusScenicspot(String scenicName, String destinationID){
        Response response = new Response();
        Integer countScenicSpot = productService.getCountScenicSpot(scenicName, destinationID);
        return response.success(countScenicSpot);
    }

    //根据条件查询景点信息
    @RequestMapping(value = "/getCusScenicspot")
    public Response getCusScenicspot(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10")Integer pageSize,
                                       String scenicName, String destinationID){
        Response response = new Response();
        HashMap<String,Object> map=new HashMap<>();
        List<CusScenicspot> scenicSpotList = productService.getScenicSpotList(pageNum, pageSize, scenicName, destinationID);
        return response.success(scenicSpotList);
    }

}
