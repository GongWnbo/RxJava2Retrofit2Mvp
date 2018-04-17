package com.sy.gwb.ui.activity.rent;

import android.support.annotation.NonNull;

import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.CacheProvider;
import com.sy.gwb.net.ProgressObserver;
import com.sy.gwb.ui.activity.RentActivity1;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import java.io.File;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by ${GongWenbo} on 2018/4/12 0012.
 */

public class RentPresenter implements RentContract.Presenter {

    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    private RentContract.View   mView;
    private CacheProvider       mCacheProvider;
    private CompositeDisposable mCompositeDisposable;

    public RentPresenter(@NonNull RentContract.View view) {
        mView = view;
        mView.setPresenter(this);
        mCompositeDisposable = new CompositeDisposable();

    }

    @Override
    public void queryPhone(String phone) {
        Observable<BaseResponse<QueryPhoneBean>> login = Api.getInstance().login(phone, key);
        CacheProvider cacheProvider = getCacheProvider();
        cacheProvider.login(login)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.<BaseResponse<QueryPhoneBean>>autoDisposable(AndroidLifecycleScopeProvider.from(((RentActivity1) mView))))
                .subscribe(new ProgressObserver<QueryPhoneBean>(((RentActivity1) mView)) {
                    @Override
                    protected void onSucceed(BaseResponse<QueryPhoneBean> baseResponse) {
                        mView.showPhoneInfo(baseResponse);
                    }

                    @Override
                    public void onFailed(Throwable e, String msg) {
                        super.onFailed(e, msg);
                        mView.showError(msg);
                    }
                });
    }

    public CacheProvider getCacheProvider() {
        RentActivity1 view = (RentActivity1) mView;
        File file = view.getCacheDir();
        if (mCacheProvider == null) {
            mCacheProvider = new RxCache.Builder()
                    .persistence(file, new GsonSpeaker()).using(CacheProvider.class);
        }
        return mCacheProvider;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void onDestroy() {
        mView = null;
    }
}
