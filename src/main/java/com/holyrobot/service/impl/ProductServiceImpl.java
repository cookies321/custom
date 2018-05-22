package com.holyrobot.service.impl;

import com.github.pagehelper.PageHelper;
import com.holyrobot.bean.*;
import com.holyrobot.mapper.*;
import com.holyrobot.service.CustomDemandService;
import com.holyrobot.service.ProductService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 赵乐
 * @create 2018-05-1614:42
 * @desc
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private CusScenicspotMapper cusScenicspotMapper;

    @Autowired
    private OmDestinationMapper omDestinationMapper;


    @Override
    public List<OmDestination> getAllDestionList() {
        OmDestinationExample omDestinationExample = new OmDestinationExample();
        List<OmDestination> omDestinations = omDestinationMapper.selectByExample(omDestinationExample);
        return omDestinations;
    }

    @Override
    public void saveScenicSpot(CusScenicspot cusScenicspot) {
        cusScenicspotMapper.insert(cusScenicspot);

    }

    @Override
    public void deleteScenincSpot(String id) {
        cusScenicspotMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<CusScenicspot> getScenicSpotList(Integer pageNum, Integer pageSize, String scenicName, String destinationID) {
        CusScenicspotExample cusScenicspotExample = new CusScenicspotExample();
        CusScenicspotExample.Criteria criteria = cusScenicspotExample.createCriteria();
        CusScenicspotExample.Criteria criteria2 = cusScenicspotExample.createCriteria();

        if(StringUtils.isNotBlank(scenicName)){
            criteria.andScenicnameLike("%"+scenicName+"%");
            criteria2.andSpellLike("%"+scenicName+"%");
        }

        if(StringUtils.isNotBlank(destinationID)){
            criteria.andDestinationidEqualTo(destinationID);
            criteria2.andDestinationidEqualTo(destinationID);
        }
        cusScenicspotExample.or(criteria2);

        PageHelper.startPage(pageNum,pageSize);
        List<CusScenicspot> cusScenicspots = cusScenicspotMapper.selectByExample(cusScenicspotExample);
        return cusScenicspots;
    }

    @Override
    public Integer getCountScenicSpot(String scenicName, String destinationID) {
        if(StringUtils.isBlank(scenicName)){
            scenicName=null;
        }
        if(StringUtils.isBlank(destinationID)){
            destinationID=null;
        }
        Integer countScenicSpot = cusScenicspotMapper.getCountScenicSpot(scenicName, destinationID);
        return countScenicSpot;
    }
}
