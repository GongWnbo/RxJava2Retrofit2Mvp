package com.sy.gwb.net;

/**
 * Java中静态内部类可以访问其外部类的成员属性和方法
 * 同时，静态内部类只有当被调用的时候才开始首次被加载，利用此特性
 * 可以实现懒汉式，在静态内部类中静态初始化外部类的单一实例即可。
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class Api {
    // 聚合手机号归属地
    //    private static final String BASE_URL = "http://apis.juhe.cn/mobile/";
    // 测试不同的json封装
    private static final String BASE_URL = "http://192.168.0.151:8080";

    private Api() {

    }

    public static ApiService getInstance() {
        return ApiInterior.sApiService;
    }

    // 利用静态内部类特性实现外部类的单例
    private static class ApiInterior {
        private static ApiService sApiService = ApiBuilder.getRetrofitBuilder().baseUrl(BASE_URL).build().create(ApiService.class);
    }

}
