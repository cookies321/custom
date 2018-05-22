package com.holyrobot.mapper;

import com.holyrobot.bean.CusScheme;
import com.holyrobot.bean.CusSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusSchemeMapper {
    int countByExample(CusSchemeExample example);

    int deleteByExample(CusSchemeExample example);

    int deleteByPrimaryKey(String id);

    int insert(CusScheme record);

    int insertSelective(CusScheme record);

    List<CusScheme> selectByExample(CusSchemeExample example);

    CusScheme selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CusScheme record, @Param("example") CusSchemeExample example);

    int updateByExample(@Param("record") CusScheme record, @Param("example") CusSchemeExample example);

    int updateByPrimaryKeySelective(CusScheme record);

    int updateByPrimaryKey(CusScheme record);
}