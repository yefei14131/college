package org.yefei.pojo;

import lombok.Data;

/**
 * @Author: yefei
 * @Date: 2021/6/26 11:21 上午
 */
@Data
public class ResponseSchool {
    private String province_name;
    private int province_id;
    private String name;
    private int school_id;
    private String level_name;
    private String nature_name;
}
