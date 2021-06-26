package org.yefei.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: yefei
 * @Date: 2021/6/26 2:40 下午
 * 专业
 *
 */
@Component
@Data
public class Special {
    private String local_batch_name;
    private String max;
    private double min;
    private String province;
    private int school_id;
    private String spname;
    private int special_id;
    private String zslx_name;
}
