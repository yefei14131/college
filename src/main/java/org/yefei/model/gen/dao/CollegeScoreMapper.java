package org.yefei.model.gen.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yefei.model.gen.pojo.CollegeScore;
import org.yefei.model.gen.pojo.CollegeScoreExample;

public interface CollegeScoreMapper {
    long countByExample(CollegeScoreExample example);

    int deleteByExample(CollegeScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollegeScore record);

    int insertSelective(CollegeScore record);

    List<CollegeScore> selectByExample(CollegeScoreExample example);

    CollegeScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CollegeScore record, @Param("example") CollegeScoreExample example);

    int updateByExample(@Param("record") CollegeScore record, @Param("example") CollegeScoreExample example);

    int updateByPrimaryKeySelective(CollegeScore record);

    int updateByPrimaryKey(CollegeScore record);
}