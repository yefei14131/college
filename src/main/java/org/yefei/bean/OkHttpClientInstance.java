package org.yefei.bean;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

/**
 * @author yefei
 * @date: 2020/4/23
 */
public enum OkHttpClientInstance {
    INSTANCE {
        @Override
        public OkHttpClient instance() {
            ConnectionPool connectionPool = new ConnectionPool(10, 10, TimeUnit.MINUTES);
            return new OkHttpClient.Builder()
                    .readTimeout(10, TimeUnit.SECONDS)
                    .connectionPool(connectionPool)
                    .build();
        }
    };

    public abstract OkHttpClient instance();
}
