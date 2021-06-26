package org.yefei.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yefei.bean.RequestContent;
import org.yefei.bean.RequestHeader;
import org.yefei.dao.SchoolDao;
import org.yefei.http.OkHttpClient;
import org.yefei.model.gen.pojo.College;
import org.yefei.pojo.Response;
import org.yefei.pojo.ResponseSchool;

import java.io.IOException;
import java.util.List;

/**
 * @Author: yefei
 * @Date: 2021/6/26 10:35 上午
 */
@Service
@Slf4j
public class SchoolService {

    @Autowired
    private OkHttpClient okHttpClient;

    @Autowired
    private SchoolDao schoolDao;

    public List<College> listCollege(String provice) {
        return schoolDao.listNoCore(provice);
    }

    public void collect(int page) {
        String url = String.format("https://api.eol.cn/gkcx/api/?access_token=&admissions=&central=&department=&dual_class=&f211=&f985=&is_doublehigh=&is_dual_class=&keyword=&nature=&page=%d&province_id=&ranktype=&request_type=1&school_type=&signsafe=&size=30&sort=view_total&top_school_id=\\[2858\\]&type=&uri=apidata/api/gk/school/lists", page);
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.put("sec-ch-ua-mobile", "?0");
        requestHeader.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36");
        requestHeader.put("Content-Type", "application/json;charset=UTF-8");

        RequestContent requestContent = new RequestContent();
        requestContent.setContentType("application/json");
        String body = String.format("{\"access_token\":\"\",\"admissions\":\"\",\"central\":\"\",\"department\":\"\",\"dual_class\":\"\",\"f211\":\"\",\"f985\":\"\",\"is_doublehigh\":\"\",\"is_dual_class\":\"\",\"keyword\":\"\",\"nature\":\"\",\"page\":%d,\"province_id\":\"\",\"ranktype\":\"\",\"request_type\":1,\"school_type\":\"\",\"size\":50,\"sort\":\"view_total\",\"top_school_id\":\"[2858]\",\"type\":\"\",\"uri\":\"apidata/api/gk/school/lists\"}", page);
        requestContent.setContent(body);

        okhttp3.Response response = okHttpClient.post(url, requestHeader, requestContent);
        if (response != null && response.code() == 200) {
            byte[] bytes = new byte[0];
            try {
                bytes = response.body().bytes();
            } catch (IOException e) {
                log.error("http请求异常", e);
            }
            try {
                Response resp = JSON.parseObject(bytes, Response.class);

                if (resp.isSuccess()) {
                    List<ResponseSchool> item = resp.getData().getItem();
                    item.forEach(responseSchool -> {
                        save(responseSchool);
                    });
                } else {
                    log.info(new String(bytes));
                }
            } catch (Exception e) {
                log.error("查询学校列表异常", e);
                log.error(new String(bytes));
            }
        } else {
            log.error("查询学校列表异常");
        }
    }

    private void save(ResponseSchool responseSchool) {
        log.info(responseSchool.toString());
        int schoolID = responseSchool.getSchool_id();
        College college = new College();
        college.setSchoolID(schoolID);
        college.setSchoolName(responseSchool.getName());
        college.setProvice(responseSchool.getProvince_name());
        college.setLevelName(responseSchool.getLevel_name());

        if (schoolDao.get(schoolID) == null) {
            schoolDao.insert(college);
        } else {
            schoolDao.update(college);
        }
    }

}
