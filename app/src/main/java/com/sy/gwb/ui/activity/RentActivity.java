package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.ProgressObserver;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RentActivity extends AppCompatActivity {

    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
    }


    public void rent(View view) {
        String phone = "13858477182";
        Api.getInstance().login(phone, key)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.<BaseResponse<QueryPhoneBean>>autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new ProgressObserver<BaseResponse<QueryPhoneBean>>(this) {
                    @Override
                    protected void onSucceed(BaseResponse baseResponse) {
                        Logger.d(baseResponse.getResult());
                    }
                });
    }
}
