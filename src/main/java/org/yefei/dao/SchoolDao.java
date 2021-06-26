package org.yefei.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.yefei.model.gen.dao.CollegeMapper;
import org.yefei.model.gen.dao.InnerCollegeMapper;
import org.yefei.model.gen.pojo.College;
import org.yefei.model.gen.pojo.CollegeExample;
import org.yefei.pojo.School;

import java.util.List;

/**
 * @Author: yefei
 * @Date: 2021/6/26 11:32 上午
 */
@Repository
public class SchoolDao {

    @Autowired
    private CollegeMapper collegeMapper;

    @Autowired
    private InnerCollegeMapper innerCollegeMapper;

    public void update(College school) {
        CollegeExample example = new CollegeExample();
        example.createCriteria().andSchoolIDEqualTo(school.getSchoolID());
        collegeMapper.updateByExampleSelective(school, example);
    }

    public void insert(College school) {
        collegeMapper.insert(school);
    }

    public College get(int schoolID) {
        CollegeExample example = new CollegeExample();
        example.createCriteria().andSchoolIDEqualTo(schoolID);
        List<College> list = collegeMapper.selectByExample(example);
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    public List<College> list() {
        CollegeExample example = new CollegeExample();
        return collegeMapper.selectByExample(example);
    }


    public List<College> listNoCore1() {
        CollegeExample example = new CollegeExample();
        example.createCriteria()
//                .andActiveEqualTo(true)
        .andIDGreaterThan(1)
        .andProviceLike("%吉林%")
        .andSchoolNameNotLike("%专科%")
        .andSchoolNameNotLike("%职业%")
        .andSchoolNameNotLike("%高等%");
        ;
        return collegeMapper.selectByExample(example);
    }

    public List<College> listNoCore() {
//        return innerCollegeMapper.listNoCore();
        return this.listNoCore1();
    }
}
