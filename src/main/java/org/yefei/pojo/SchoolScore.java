package org.yefei.pojo;

import lombok.Data;

/**
 * @Author: yefei
 * @Date: 2021/6/26 11:23 上午
 */
@Data
public class SchoolScore {
    private int schoolID;
    private String schoolName;
    /**
     * 专业ID
     */
    private int specialID;
    /**
     * 专业名称
     */
    private String specialName;
    /**
     * 录取批次
     */
    private String batchName;

    private int year;

    private int score;

    private int scoreLineBatch2;
}
