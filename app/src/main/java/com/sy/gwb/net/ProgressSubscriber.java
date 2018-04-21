package com.sy.gwb.net;

import android.app.Activity;
import android.os.Handler;

import com.sy.gwb.ui.dialog.LoadingDialog;


/**
 * Created by GongWenBo on 2018/3/25.
 */

// TODO: 2018/3/25 自己根据需求定义
public abstract class ProgressSubscriber<T> extends BaseSubscriber<T> {

    private static final long TIME = 1000;
    private Activity      mContext;
    private String        title;
    private LoadingDialog mDialog;

    public ProgressSubscriber(Activity context) {
        this.mContext = context;
        show();
    }

    public ProgressSubscriber(Activity context, String title) {
        this.mContext = context;
        this.title = title;
    }

    @Override
    public void onComplete() {
        super.onComplete();
        dismiss();
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
        dismiss();
    }

    public void dismiss() {
        if (mDialog != null) {
            delay(TIME);
        }
    }

    public void delay(long time) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mDialog.dismiss();
            }
        }, time);
    }

    public void show() {
        if (mDialog == null) {
            mDialog = new LoadingDialog();
        }
        mDialog.show(mContext.getFragmentManager(), "loading");
    }
}
