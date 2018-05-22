package com.holyrobot.service.impl;

import com.github.pagehelper.PageHelper;
import com.holyrobot.bean.CusCusinfo;
import com.holyrobot.bean.CusCusinfoDest;
import com.holyrobot.bean.CusCusinfoExample;
import com.holyrobot.bean.CusCusinfoServicetype;
import com.holyrobot.mapper.CusCusinfoDestMapper;
import com.holyrobot.mapper.CusCusinfoMapper;
import com.holyrobot.mapper.CusCusinfoServicetypeMapper;
import com.holyrobot.service.CustomDemandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
public class CustomDemandServiceImpl implements CustomDemandService {

    @Autowired
    private CusCusinfoMapper cusCusinfoMapper;

    @Autowired
    private CusCusinfoDestMapper cusCusinfoDestMapper;

    @Autowired
    private CusCusinfoServicetypeMapper cusCusinfoServicetypeMapper;

    @Transactional
    @Override
    public void saveCustomDemand(CusCusinfo cusinfo) {
        //保存定制游需求信息
        if("".equals(cusinfo.getId())){
            cusinfo.setId(UUID.randomUUID().toString());
        }
        cusCusinfoMapper.insert(cusinfo);
        String cusinfoId = cusinfo.getId();
        //保存定制游需求的目的地信息
        String destinationid = cusinfo.getDestinationid();
        String[] destinationids = destinationid.split(",");
        String destination = cusinfo.getDestination();
        String[] destinations = destination.split(",");
        for (int i = 0; i < destinationids.length; i++) {
            CusCusinfoDest cusCusinfoDest = new CusCusinfoDest(UUID.randomUUID().toString(),cusinfoId,destinationids[i],destinations[i]);
            cusCusinfoDestMapper.insert(cusCusinfoDest);
        }
        //保存定制游服务类型
        String servicetypeid = cusinfo.getServicetypeid();
        String[] servicetypeids = servicetypeid.split(",");
        String servicetype = cusinfo.getServicetype();
        String[] servicetypes = servicetype.split(",");
        for (int i = 0; i < servicetypeids.length; i++) {
            CusCusinfoServicetype cusCusinfoServicetype = new CusCusinfoServicetype(UUID.randomUUID().toString(),cusinfoId,servicetypeids[i]);
            cusCusinfoServicetypeMapper.insert(cusCusinfoServicetype);
        }

    }

    @Override
    public List<CusCusinfo> getCusCusinfoList(Integer pageNum,Integer pageSize,String datemin,String datemax,String travellername) {
        CusCusinfoExample cusCusinfoExample = new CusCusinfoExample();
        CusCusinfoExample.Criteria criteria = cusCusinfoExample.createCriteria();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if(StringUtils.isNotBlank(datemin)){

                Date dateminDate = simpleDateFormat.parse(datemin);

                criteria.andStartdateGreaterThanOrEqualTo(dateminDate);
            }
            if(StringUtils.isNotBlank(datemax)){
                Date datemaxDate = simpleDateFormat.parse(datemax);
                criteria.andStartdateLessThanOrEqualTo(datemaxDate);
            }
            if(StringUtils.isNotBlank(travellername)){
                criteria.andTravellernameLike("%"+travellername+"%");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        PageHelper.startPage(pageNum,pageSize);
        List<CusCusinfo> cusCusinfos = cusCusinfoMapper.selectByExample(cusCusinfoExample);
        return cusCusinfos;
    }

    @Override
    public Integer getCountCustomDemeand(String datemin,String datemax,String travellername) {
        if(StringUtils.isBlank(datemin)){
            datemin=null;
        }
        if(StringUtils.isBlank(datemax)){
            datemax=null;
        }
        if(StringUtils.isBlank(travellername)){
            travellername=null;
        }
        Integer count = cusCusinfoMapper.getCount(datemin,datemax,travellername);
        return count;
    }
}
