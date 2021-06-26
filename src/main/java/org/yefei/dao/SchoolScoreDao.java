package org.yefei.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.yefei.model.gen.dao.CollegeScoreMapper;
import org.yefei.model.gen.pojo.CollegeScore;
import org.yefei.model.gen.pojo.CollegeScoreExample;

/**
 * @Author: yefei
 * @Date: 2021/6/26 11:32 上午
 */
@Repository
public class SchoolScoreDao {

    @Autowired
    private CollegeScoreMapper collegeScoreMapper;

    public void save(CollegeScore score) {
        collegeScoreMapper.insertSelective(score);
    }

    public boolean exists(int schoolID, int year) {
        CollegeScoreExample example = new CollegeScoreExample();
        example.createCriteria().andSchoolIDEqualTo(schoolID).andYearEqualTo(year) ;
        return !CollectionUtils.isEmpty(collegeScoreMapper.selectByExample(example));
    }
}
