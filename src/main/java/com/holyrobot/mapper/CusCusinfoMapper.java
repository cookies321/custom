package com.holyrobot.mapper;

import com.holyrobot.bean.CusCusinfo;
import com.holyrobot.bean.CusCusinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusCusinfoMapper {
    int countByExample(CusCusinfoExample example);

    int deleteByExample(CusCusinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusCusinfo record);

    int insertSelective(CusCusinfo record);

    List<CusCusinfo> selectByExample(CusCusinfoExample example);

    CusCusinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusCusinfo record, @Param("example") CusCusinfoExample example);

    int updateByExample(@Param("record") CusCusinfo record, @Param("example") CusCusinfoExample example);

    int updateByPrimaryKeySelective(CusCusinfo record);

    int updateByPrimaryKey(CusCusinfo record);

    Integer getCount(@Param("datemin") String datemin, @Param("datemax") String datemax, @Param("travellername") String travellername);
}