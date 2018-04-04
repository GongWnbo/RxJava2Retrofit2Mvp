package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.sy.gwb.App;
import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.CacheProvider;
import com.sy.gwb.net.ProgressObserver;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

public class RentActivity extends AppCompatActivity {

    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    private static final String TAG = "MainActivity";
    @BindView(R.id.tv_msg)
    TextView mTvMsg;
    private CacheProvider mCacheProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        ButterKnife.bind(this);
    }

    public void rent(View view) {
        String phone = "13858477182";
        Observable<BaseResponse<QueryPhoneBean>> login = Api.getInstance().login(phone, key);
        CacheProvider cacheProvider = getCacheProvider();
        cacheProvider.login(login)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.<BaseResponse<QueryPhoneBean>>autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new ProgressObserver<BaseResponse<QueryPhoneBean>>(this) {
                    @Override
                    protected void onSucceed(BaseResponse baseResponse) {
                        Logger.d(baseResponse.getResult());
                        mTvMsg.setText(baseResponse.getResult().toString());
                    }

                    @Override
                    public void onFailed(Throwable e, String msg) {
                        super.onFailed(e, msg);
                        mTvMsg.setText(msg);
                    }
                });
    }

    public CacheProvider getCacheProvider() {
        File file = getCacheDir();
        if (mCacheProvider == null) {
            mCacheProvider = new RxCache.Builder()
                    .persistence(file, new GsonSpeaker()).using(CacheProvider.class);
        }
        return mCacheProvider;
    }
}
