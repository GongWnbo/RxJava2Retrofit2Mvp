package com.sy.gwb.net;

/**
 * Java中静态内部类可以访问其外部类的成员属性和方法
 * 同时，静态内部类只有当被调用的时候才开始首次被加载，利用此特性
 * 可以实现懒汉式，在静态内部类中静态初始化外部类的单一实例即可。
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class Api {

    private static final String BASE_URL = "http://apis.juhe.cn/mobile/";

    private Api() {

    }

    // 利用静态内部类特性实现外部类的单例
    private static class ApiInterior {
        private static ApiService sApiService = new ApiBuilder().getRetrofitBuilder().baseUrl(BASE_URL).build().create(ApiService.class);
    }

    public static ApiService getInstance() {
        return ApiInterior.sApiService;
    }

}
