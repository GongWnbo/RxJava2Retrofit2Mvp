package com.sy.gwb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sy.gwb.entity.ReturnResult;
import com.sy.gwb.net.Api;
import com.sy.gwb.util.Util;

import java.util.HashMap;
import java.util.TreeMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class RentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
    }

    public void rent(View view) {
        HashMap hm = new HashMap();
        String[] sign = Util.sign();
        hm.put("action", "RETURNBIKECONFIRM");
        hm.put("userId", "8a9996bb621e0d0e01621e0f439f0000");
        hm.put("cityName", "上海市");
        hm.put("rank", "0");
        hm.put("os", "android");
        hm.put("version", "V1.0");
        hm.put("randomNum", sign[0]);
        hm.put("sign", sign[1]);
        Api.getInstance().rent(hm)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ReturnResult>() {
                    @Override
                    public void accept(ReturnResult returnResult) throws Exception {
                        ReturnResult.Content content = returnResult.getContent();
                    }
                });

    }

}
