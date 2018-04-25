package com.sy.gwb.ui.activity.rent;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.net.Api;
import com.sy.gwb.net.CacheProvider;
import com.sy.gwb.net.ProgressSubscriber;
import com.sy.gwb.net.RxSchedulersHelper;

import java.io.File;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by ${GongWenbo} on 2018/4/12 0012.
 */

public class QueryPhonePresenter implements QueryPhoneContract.Presenter {

    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    private QueryPhoneContract.View mView;
    private CacheProvider           mCacheProvider;
    private CompositeDisposable     mCompositeDisposable;
    private Activity                mActivity;

    public QueryPhonePresenter(@NonNull QueryPhoneContract.View view, Activity activity) {
        mView = view;
        mView.setPresenter(this);
        mActivity = activity;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void queryPhone(String phone) {
//        Observable<BaseResponse<QueryPhoneBean>> login = Api.getInstance().login(phone, key);
//        CacheProvider cacheProvider = getCacheProvider();
//        cacheProvider.login(login)
//                .compose(RxSchedulersHelper.<BaseResponse<QueryPhoneBean>>io_main())
//                //                .as(AutoDispose.<BaseResponse<QueryPhoneBean>>autoDisposable(AndroidLifecycleScopeProvider.from(((QueryPhoneFragment) mView))))
//                .subscribe(new ProgressSubscriber<QueryPhoneBean>(mActivity) {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        mCompositeDisposable.add(d);
//                    }
//
//                    @Override
//                    protected void onSucceed(BaseResponse<QueryPhoneBean> baseResponse) {
//                        mView.showPhoneSucceed(baseResponse);
//                    }
//
//                    @Override
//                    public void onFailed(Throwable e, String msg) {
//                        super.onFailed(e, msg);
//                        mView.showPhoneError(msg);
//                    }
//                });
    }

    public CacheProvider getCacheProvider() {
        File file = mActivity.getCacheDir();
        if (mCacheProvider == null) {
            mCacheProvider = new RxCache.Builder()
                    .persistence(file, new GsonSpeaker())
                    .using(CacheProvider.class);
        }
        return mCacheProvider;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {
        mCompositeDisposable.clear();
    }

    @Override
    public void onDestroy() {
        mView = null;
    }
}
