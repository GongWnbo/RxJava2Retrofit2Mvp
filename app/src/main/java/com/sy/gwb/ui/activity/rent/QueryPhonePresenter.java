package com.sy.gwb.ui.activity.rent;

import android.content.Context;
import android.support.annotation.NonNull;

import com.sy.gwb.net.CacheProvider;

import java.io.File;

import io.reactivex.disposables.CompositeDisposable;
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
    private Context mContext;

    public QueryPhonePresenter(@NonNull QueryPhoneContract.View view, Context context) {
        mView = view;
        mView.setPresenter(this);
        mContext = context;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void queryPhone(String phone) {
//        Observable<BaseResponse<QueryPhoneBean1>> login = Api.getInstance().login(phone, key);
//        CacheProvider cacheProvider = getCacheProvider();
//        cacheProvider.login(login)
//                .compose(RxSchedulersHelper.<BaseResponse<QueryPhoneBean1>>io_main())
////                .as(AutoDispose.<BaseResponse<QueryPhoneBean1>>autoDisposable(AndroidLifecycleScopeProvider.from(((QueryPhoneFragment) mView))))
//                .subscribe(new ProgressObserver<QueryPhoneBean1>(mContext) {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        super.onSubscribe(d);
//                        mCompositeDisposable.add(d);
//                    }
//
//                    @Override
//                    protected void onSucceed(BaseResponse<QueryPhoneBean1> baseResponse) {
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
        File file = mContext.getCacheDir();
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
