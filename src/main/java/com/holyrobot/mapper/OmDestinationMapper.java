package com.holyrobot.mapper;

import com.holyrobot.bean.OmDestination;
import com.holyrobot.bean.OmDestinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmDestinationMapper {
    int countByExample(OmDestinationExample example);

    int deleteByExample(OmDestinationExample example);

    int deleteByPrimaryKey(String id);

    int insert(OmDestination record);

    int insertSelective(OmDestination record);

    List<OmDestination> selectByExample(OmDestinationExample example);

    OmDestination selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OmDestination record, @Param("example") OmDestinationExample example);

    int updateByExample(@Param("record") OmDestination record, @Param("example") OmDestinationExample example);

    int updateByPrimaryKeySelective(OmDestination record);

    int updateByPrimaryKey(OmDestination record);
}