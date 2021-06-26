package org.yefei.http;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.yefei.bean.MockResponse;
import org.yefei.bean.RequestContent;
import org.yefei.bean.RequestHeader;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yefei
 * @Date: 2021/6/26 10:39 上午
 */
@Service
@Slf4j
public class OkHttpClient {

    private okhttp3.OkHttpClient okHttpClient;

    public OkHttpClient(){
        ConnectionPool connectionPool = new ConnectionPool(10, 1, TimeUnit.MINUTES);
        okHttpClient = new okhttp3.OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectionPool(connectionPool)
                .build();
    }

    public Response get(String url, RequestHeader headers) {
        // 准备header
        if (headers == null) {
            headers = new RequestHeader();
        }
        Headers okHeaders = Headers.of(headers);
        return getMockResponse(url, okHeaders, null);
    }


    public Response post(String url, RequestHeader headers, RequestContent requestContent) {
        // 准备header
        if (headers == null) {
            headers = new RequestHeader();
        }
        Headers okHeaders = Headers.of(headers);
        return getMockResponse(url, okHeaders, requestContent);
    }

    private void setRequestBody(Request.Builder requestBuilder, RequestContent requestContent) {
        String content = requestContent.getContent();
        if (StringUtils.isNotEmpty(content)) {
            // form 表单
            if (content.startsWith("[")) {

                List<HashMap> list = JSONObject.parseArray(content, HashMap.class);
                HashMap body = new HashMap();
                list.forEach(item -> {
                    body.putAll(item);
                });
                requestBuilder.post(RequestBody.create(MediaType.parse("application/json"), JSONObject.toJSONString(body).getBytes()));
                requestBuilder.header("Content-Type", "application/json");
            } else if (content.startsWith("{")) {
                // content-type: json
                requestBuilder.post(RequestBody.create(MediaType.parse("application/json"), content.getBytes()));
                requestBuilder.header("Content-Type", "application/json");
            } else {
                requestBuilder.post(RequestBody.create(MediaType.parse(requestContent.getContentType()), content.getBytes()));
                requestBuilder.header("Content-Type", requestContent.getContentType());
                return;
            }
        }
    }

    private Response getMockResponse(String url, Headers headers, RequestContent requestContent) {
        log.info("准备调用http服务: {}", url);
        Request.Builder requestBuilder = new Request.Builder().url(url);

        if (headers != null) {
            requestBuilder.headers(headers);
        }
        if (requestContent != null) {
            setRequestBody(requestBuilder, requestContent);
        }

        Request request = requestBuilder.build();

        Call call = okHttpClient.newCall(request);

        Response response = null;
        try {
            return call.execute();
        } catch (Exception e) {
            log.error("请求http服务异常", e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {

            }
        }
        return null;
    }
}
