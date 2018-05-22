package com.holyrobot.mapper;

import com.holyrobot.bean.OmDeparture;
import com.holyrobot.bean.OmDepartureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmDepartureMapper {
    int countByExample(OmDepartureExample example);

    int deleteByExample(OmDepartureExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmDeparture record);

    int insertSelective(OmDeparture record);

    List<OmDeparture> selectByExample(OmDepartureExample example);

    OmDeparture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmDeparture record, @Param("example") OmDepartureExample example);

    int updateByExample(@Param("record") OmDeparture record, @Param("example") OmDepartureExample example);

    int updateByPrimaryKeySelective(OmDeparture record);

    int updateByPrimaryKey(OmDeparture record);
}