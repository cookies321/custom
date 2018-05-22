package com.holyrobot.mapper;

import com.holyrobot.bean.CusScenicspot;
import com.holyrobot.bean.CusScenicspotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusScenicspotMapper {
    int countByExample(CusScenicspotExample example);

    int deleteByExample(CusScenicspotExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusScenicspot record);

    int insertSelective(CusScenicspot record);

    List<CusScenicspot> selectByExample(CusScenicspotExample example);

    CusScenicspot selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusScenicspot record, @Param("example") CusScenicspotExample example);

    int updateByExample(@Param("record") CusScenicspot record, @Param("example") CusScenicspotExample example);

    int updateByPrimaryKeySelective(CusScenicspot record);

    int updateByPrimaryKey(CusScenicspot record);

    Integer getCountScenicSpot(@Param("scenicName")String scenicName,@Param("destinationID") String destinationID);
}