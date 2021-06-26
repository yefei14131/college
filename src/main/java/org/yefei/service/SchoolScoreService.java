package org.yefei.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yefei.bean.RequestContent;
import org.yefei.bean.RequestHeader;
import org.yefei.dao.SchoolDao;
import org.yefei.dao.SchoolScoreDao;
import org.yefei.http.OkHttpClient;
import org.yefei.model.gen.pojo.College;
import org.yefei.model.gen.pojo.CollegeScore;
import org.yefei.pojo.Response;
import org.yefei.pojo.ResponseSchool;
import org.yefei.pojo.ScoreResponse;
import org.yefei.pojo.Special;

import java.io.IOException;
import java.util.List;

/**
 * @Author: yefei
 * @Date: 2021/6/26 10:35 上午
 */
@Service
@Slf4j
public class SchoolScoreService {

    @Autowired
    private OkHttpClient okHttpClient;

    @Autowired
    private SchoolScoreDao schoolScoreDao;

    public void collectCore(int schoolID, String schoolName) {
        try {

            log.info("{} 查询录取分", schoolName);
            boolean success2020 = collectCore(schoolID, 2020, schoolName);
            if (!success2020) {
                log.info("{} 采集2020年分数没有结果", schoolName);
//                return;
            }
            boolean success2019 = collectCore(schoolID, 2019, schoolName);
            if (!success2019) {
                log.info("{} 采集2019年分数没有结果", schoolName);
//                return;
            }
            boolean success2018 = collectCore(schoolID, 2018, schoolName);
            if (!success2018) {
                log.info("{} 采集2018年分数没有结果", schoolName);
            }
        } catch (Exception e) {
            log.error("异常", e);
        }
    }

    private boolean collectCore(int schoolID, int year, String schoolName) throws InterruptedException {
        if (schoolScoreDao.exists(schoolID, year)) {
            log.info("{} {} 专业录取分已经存在", schoolName, year);
            return false;
        }

        int pageSize = 10;
        ScoreResponse scoreResponse = collectCore(schoolID, schoolName, year, 1);
        if (scoreResponse == null || !scoreResponse.isSuccess()) {
            return false;
        }

        saveSpecial(scoreResponse.getData().getItem(), schoolName, year );

        int recoredTotal = scoreResponse.getData().getNumFound();
        if (recoredTotal <= 10) {
            return true;
        }
        int pageTotal = recoredTotal % pageSize == 0 ? recoredTotal / pageSize : recoredTotal / pageSize + 1;

        for (int page = 2; page <= pageTotal; page++) {
            ScoreResponse scoreResponse2 = collectCore(schoolID, schoolName, year, page);
            if (scoreResponse2 == null || !scoreResponse2.isSuccess()) {
                log.info("获取录取分没有返回数据, {}", schoolName);
                continue;
            }
            saveSpecial(scoreResponse2.getData().getItem(), schoolName, year);
        }
        return true;
    }

    private ScoreResponse collectCore(int schoolID, String schoolName, int year, int page) throws InterruptedException {
        Thread.sleep(2000L);
        String url = String.format("https://static-data.eol.cn/www/2.0/schoolspecialindex/%d/%d/51/1/8/%d.json", year, schoolID, page);
        okhttp3.Response response = okHttpClient.get(url, null);
        if (response != null && response.code() == 200) {
            byte[] bytes = new byte[0];
            try {
                bytes = response.body().bytes();
                if (bytes.length == 0) {
                    log.info("{} 查询录取分没有返回结果", schoolName);
                    return null;
                } else {
                    return JSON.parseObject(bytes, ScoreResponse.class);
                }
            } catch (IOException e) {
                log.error("http请求查询专业录取分异常", e);
                return null;
            }
        } else {
            log.error("http请求查询专业录取分错误");
        }
        return null;
    }

    private void saveSpecial(List<Special> specials, String schoolName, int year) {
        specials.forEach(special -> {
            CollegeScore collegeScore = new CollegeScore();
            collegeScore.setSchoolID(special.getSchool_id());
            collegeScore.setSchoolName(schoolName);
            collegeScore.setScore((int)special.getMin());
            collegeScore.setSpecialID(special.getSpecial_id());
            collegeScore.setSpecialName(special.getSpname());
            collegeScore.setYear(year);
            collegeScore.setBatchName(special.getLocal_batch_name());
            schoolScoreDao.save(collegeScore);
        });
    }

}
