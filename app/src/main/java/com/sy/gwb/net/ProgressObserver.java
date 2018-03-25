package com.sy.gwb.net;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by GongWenBo on 2018/3/25.
 */

// TODO: 2018/3/25 大致实现,功能还要细化 
public abstract class ProgressObserver<T> extends BaseSubscriber {

    private Context mContext;
    private String  title;
    private Dialog  mDialog;

    public ProgressObserver(Context context) {
        this.mContext = context;
    }

    public ProgressObserver(Context context, String title) {
        this.mContext = context;
        this.title = title;
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        if (!d.isDisposed()) {
            mDialog = new AlertDialog.Builder(mContext).setTitle(title == null ? "正在加载中..."
                    : title).show();
        }
    }

    @Override
    public void onComplete() {
        super.onComplete();
        if (mDialog != null) {
            mDialog.dismiss();
        }
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
        if (mDialog != null) {
            mDialog.dismiss();
        }
    }
}
