package com.sy.gwb.net;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class Api {

    private static ApiService sApiService;
    private static final String BASE_URL = "http://apis.juhe.cn/mobile/";

    public static ApiService getInstance() {
        if (sApiService == null) {
            synchronized (Api.class) {
                sApiService = ApiBuilder.getRetrofitBuilder().baseUrl(BASE_URL).build().create(ApiService.class);
            }
        }
        return sApiService;
    }

}
