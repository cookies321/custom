package com.holyrobot.mapper;

import com.holyrobot.bean.CusCusinfoServicetype;
import com.holyrobot.bean.CusCusinfoServicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusCusinfoServicetypeMapper {
    int countByExample(CusCusinfoServicetypeExample example);

    int deleteByExample(CusCusinfoServicetypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusinfoServicetype record);

    int insertSelective(CusCusinfoServicetype record);

    List<CusCusinfoServicetype> selectByExample(CusCusinfoServicetypeExample example);

    CusCusinfoServicetype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusinfoServicetype record, @Param("example") CusCusinfoServicetypeExample example);

    int updateByExample(@Param("record") CusCusinfoServicetype record, @Param("example") CusCusinfoServicetypeExample example);

    int updateByPrimaryKeySelective(CusCusinfoServicetype record);

    int updateByPrimaryKey(CusCusinfoServicetype record);
}