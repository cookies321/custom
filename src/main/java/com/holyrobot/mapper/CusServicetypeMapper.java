package com.holyrobot.mapper;

import com.holyrobot.bean.CusServicetype;
import com.holyrobot.bean.CusServicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusServicetypeMapper {
    int countByExample(CusServicetypeExample example);

    int deleteByExample(CusServicetypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusServicetype record);

    int insertSelective(CusServicetype record);

    List<CusServicetype> selectByExample(CusServicetypeExample example);

    CusServicetype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusServicetype record, @Param("example") CusServicetypeExample example);

    int updateByExample(@Param("record") CusServicetype record, @Param("example") CusServicetypeExample example);

    int updateByPrimaryKeySelective(CusServicetype record);

    int updateByPrimaryKey(CusServicetype record);
}