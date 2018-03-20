package com.sy.gwb.net;


import com.sy.gwb.entity.BaseResponse;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */
public abstract class BaseSubscriber<T> extends DisposableObserver<BaseResponse<T>> {
    private static final String CODE = "200";

    @Override
    public void onNext(BaseResponse<T> baseResponse) {
        if (baseResponse.getResultcode().equals(CODE)) {
            onSucceed(baseResponse);
        } else {
            onFailed(baseResponse);
        }
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {

    }

    public void onFailed(BaseResponse<T> baseResponse) {
        // TODO: 2018/3/19 0019 失败
    }

    protected abstract void onSucceed(BaseResponse<T> baseResponse);
}
