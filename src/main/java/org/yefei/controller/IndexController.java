package org.yefei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yefei.model.gen.pojo.College;
import org.yefei.service.SchoolScoreService;
import org.yefei.service.SchoolService;

import java.util.List;

/**
 * @Author: yefei
 * @Date: 2021/6/26 10:33 上午
 */
@Controller
@RequestMapping("/index")
@Slf4j
public class IndexController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private SchoolScoreService schoolScoreService;
    
    @RequestMapping("/school/collect")
    @ResponseBody
    public Object collectSchool(@RequestParam(name = "page", defaultValue = "1") int initPage) {
        new Thread(()->{
            int pageSize = 30;
            int total = 2858;
            int pageTotal = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;

            for (int page = initPage; page <= pageTotal; page++) {
                schoolService.collect(page);
                try {
                    Thread.sleep(3000L);
                    log.info("已查询 {} 页, 共 {} 页", page, pageTotal);
                } catch (InterruptedException e) {
                    log.error("查询 {} 页异常", page);
                }
            }
        }).start();
        return "ok";
    }


    @RequestMapping("/school_score/collect")
    @ResponseBody
    public Object collectSchoolScore(@RequestParam(name = "provice", defaultValue = "北京") String provice) {
        new Thread(()->{
            List<College> list = schoolService.listCollege(provice);
            list.forEach(college -> schoolScoreService.collectCore(college.getSchoolID(), college.getSchoolName()));
            log.info("执行完毕");
        }).start();
        return "ok";
    }



}
