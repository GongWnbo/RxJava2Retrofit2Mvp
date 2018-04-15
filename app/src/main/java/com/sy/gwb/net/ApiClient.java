package com.sy.gwb.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class ApiClient {

    private static final int CONNECT_TIME_OUT = 5; // 连接时间
    private static final int READ_TIME_OUT    = 5; // 读取时间
    private static final int WRITE_TIME_OUT   = 5; // 写入时间

    protected static OkHttpClient getOkHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        // 不设置日志打印不了
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIME_OUT, TimeUnit.SECONDS)
                // TODO: 2018/3/19 0019 如果有抽取
                // 添加统一的head
//                .addInterceptor(new Interceptor() {
//                    @Override
//                    public Response intercept(Chain chain) throws IOException {
//                        Request request = chain.request();
//                        HttpUrl url = request.url().newBuilder().build();
//                        Request build = request.newBuilder().addHeader("head", "head1")
//                                .url(url)
//                                .build();
//                        // TODO: 2018/4/15 这里要注意的是不要调用request,要调用build,不然会导致请求头参数传递失败
//                        return chain.proceed(build);
//                    }
//                })
                // 添加net日志，便于找bug
                .addInterceptor(interceptor)
                // 是否添加断网重连功能
                .retryOnConnectionFailure(true)
                .build();
        return client;
    }
}
