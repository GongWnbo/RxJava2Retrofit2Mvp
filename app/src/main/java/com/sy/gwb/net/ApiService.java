package com.sy.gwb.net;



import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public interface ApiService {
    // http://apis.juhe.cn/mobile/get?phone=13429667914&key=您申请的KEY

    @GET("get")
    Observable<BaseResponse<QueryPhoneBean>> login(@Query("phone") String phone, @Query("key") String key);

}
