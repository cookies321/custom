package com.holyrobot.mapper;

import com.holyrobot.bean.CusCusinfoDest;
import com.holyrobot.bean.CusCusinfoDestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusCusinfoDestMapper {
    int countByExample(CusCusinfoDestExample example);

    int deleteByExample(CusCusinfoDestExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusinfoDest record);

    int insertSelective(CusCusinfoDest record);

    List<CusCusinfoDest> selectByExample(CusCusinfoDestExample example);

    CusCusinfoDest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusinfoDest record, @Param("example") CusCusinfoDestExample example);

    int updateByExample(@Param("record") CusCusinfoDest record, @Param("example") CusCusinfoDestExample example);

    int updateByPrimaryKeySelective(CusCusinfoDest record);

    int updateByPrimaryKey(CusCusinfoDest record);
}