package com.sy.gwb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.orhanobut.logger.Logger;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.BaseSubscriber;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    private static final String TAG = "MainActivity";

    private String uri = "https://github.com/bumptech/glide/raw/master/static/glide_logo.png";
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIv = findViewById(R.id.iv);
    }

    public void request(View view) {
        queryPhone();
    }

    private void queryPhone() {
        Api.getInstance().login("13858477182", key)
                // 上游
                .subscribeOn(Schedulers.io())
                // 下游
                .observeOn(AndroidSchedulers.mainThread())
                // 防止rxjava2内存泄露
                .as(AutoDispose.<BaseResponse<QueryPhoneBean>>autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new BaseSubscriber<QueryPhoneBean>() {
                    @Override
                    protected void onSucceed(BaseResponse<QueryPhoneBean> baseResponse) {
                        Logger.d(baseResponse.getResult().toString());
                    }

                });
    }

}
