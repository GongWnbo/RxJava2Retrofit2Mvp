package com.sy.gwb.ui.activity;

import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.sy.gwb.BaseActivity;
import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.CacheProvider;
import com.sy.gwb.net.ProgressSubscriber;
import com.sy.gwb.net.RxSchedulersHelper;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

public class RentActivity1 extends BaseActivity {

    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    @BindView(R.id.tv)
    TextView mTv;
    private CacheProvider mCacheProvider;

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_rent;
    }

    @OnClick(R.id.btn_query_phone)
    public void onViewClicked() {
        Observable<QueryPhoneBean> login = Api.getInstance().login("13858477182", key);
        CacheProvider cacheProvider = getCacheProvider();
        cacheProvider.login(login)
                .compose(RxSchedulersHelper.<QueryPhoneBean>io_main())
                .subscribe(new Consumer<QueryPhoneBean>() {
                    @Override
                    public void accept(QueryPhoneBean queryPhoneBean) throws Exception {
                        QueryPhoneBean.ResultBean result = queryPhoneBean.getResult();
                        mTv.setText(result.getCity());
                    }
                });
    }

    public CacheProvider getCacheProvider() {
        File file = getCacheDir();
        if (mCacheProvider == null) {
            mCacheProvider = new RxCache.Builder()
                    .persistence(file, new GsonSpeaker())
                    .using(CacheProvider.class);
        }
        return mCacheProvider;
    }

}
