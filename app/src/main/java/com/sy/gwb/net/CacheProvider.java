package com.sy.gwb.net;

import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean1;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.LifeCache;

/**
 * Created by ${GongWenbo} on 2018/4/4 0004.
 */

public interface CacheProvider {
    int TIME = 7;

//    @Expirable(false)   //false表示内存不足系统回收时永远不回收
    @LifeCache(duration = TIME, timeUnit = TimeUnit.DAYS)  //缓存时间
    Observable<BaseResponse<QueryPhoneBean1>> login(Observable<BaseResponse<QueryPhoneBean1>> login);

}
