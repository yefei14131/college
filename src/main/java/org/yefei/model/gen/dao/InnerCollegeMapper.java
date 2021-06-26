package org.yefei.model.gen.dao;

import org.apache.ibatis.annotations.Select;
import org.yefei.model.gen.pojo.College;

import java.util.List;

public interface InnerCollegeMapper {

    @Select("select s.* from college s where active = 1 and s.schoolID not in (select DISTINCT schoolID from college_score)")
    List<College> listNoCore();

}