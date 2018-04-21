package com.sy.gwb.ui.dialog;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import butterknife.ButterKnife;

/**
 * Created by ${GongWenbo} on 2018/4/2 0002.
 */

public abstract class BaseDialog extends DialogFragment {

    private static final int TIME = 600;
    protected View               mView;
    private   BaseDialogListener mBaseDialogListener;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            dismiss();
            if (mBaseDialogListener != null) {
                mBaseDialogListener.dismiss();
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);//设置dialog没有title
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getDialog().getWindow().setDimAmount(0f);
        mView = inflater.inflate(getLayoutId(), null);
        ButterKnife.bind(this,mView);
        init();
        return mView;
    }

    protected abstract void init();

    protected abstract int getLayoutId();

    @Override
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    public void show(FragmentManager manager, String tag) {
        show(manager, tag, false);
    }

    public void show(FragmentManager manager, String tag, boolean autoHide) {
        if (autoHide) {
            mHandler.sendEmptyMessageDelayed(0, TIME);
        }
        super.show(manager, tag);
    }

    public void setBaseDialogListener(BaseDialogListener baseDialogListener) {
        mBaseDialogListener = baseDialogListener;
    }

    public interface BaseDialogListener {
        void dismiss();
    }
}
