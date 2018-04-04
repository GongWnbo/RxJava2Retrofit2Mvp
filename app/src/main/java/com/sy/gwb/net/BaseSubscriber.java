package com.sy.gwb.net;


import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.sy.gwb.entity.BaseResponse;

import io.reactivex.Observer;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */
public abstract class BaseSubscriber<T> implements Observer<BaseResponse<T>> {
    private static final String CODE = "200";

    @Override
    public void onNext(BaseResponse<T> baseResponse) {
        if (baseResponse.getResultcode().equals(CODE)) {
            onSucceed(baseResponse);
        } else {
            onFailed(new Exception(baseResponse.getReason()),baseResponse.getReason());
        }
    }

    @Override
    public void onError(Throwable e) {
        onFailed(e,RxExceptionUtil.exceptionHandler(e));
    }

    @Override
    public void onComplete() {

    }

    public void onFailed(Throwable e, String msg) {
        Logger.d("onFailed e="+e+",msg="+msg);
    }

    protected abstract void onSucceed(BaseResponse<T> baseResponse);
}
