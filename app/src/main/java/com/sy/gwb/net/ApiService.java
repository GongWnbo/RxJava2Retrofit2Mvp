package com.sy.gwb.net;


import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean1;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public interface ApiService {
    // http://apis.juhe.cn/mobile/get?phone=13429667914&key=您申请的KEY

    @GET("get")
    Observable<BaseResponse<QueryPhoneBean1>> login(@Query("phone") String phone, @Query("key") String key);

    // 单文件上传
//    @Multipart
//    @POST("{url}")
//    Observable<ResponseBody> upLoadFile(
//            @Path("url") String url,
//            @Part("image\\\\" filename=\\"image.jpg") RequestBody avatar);

    // 多文件上传
    @POST("{url}")
    Observable<ResponseBody> uploadFiles(
            @Path("url") String url,
            @Path("headers") Map<String, String> headers,
            @Part("filename") String description,
            @PartMap()  Map<String, RequestBody> maps);

    // 文件下载
    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);
}
