package org.yefei.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author: yefei
 * @Date: 2021/6/26 11:19 上午
 */
@Data
public class ScoreResponse {
    public final static String SUCCESS = "0000";

    public boolean isSuccess(){
        return SUCCESS.equals(this.code);
    }

    private String code;
    private String message;
    private Data data;

    @lombok.Data
    public static class Data {
        private int numFound;
        private List<Special> item;
    }
}
