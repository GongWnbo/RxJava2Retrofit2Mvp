package com.sy.gwb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sy.gwb.util.ToastUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment<T extends BaseActivity> extends Fragment {

    public BaseActivity mContext;
    private Unbinder mUnbinder;

    public BaseFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        mUnbinder = ButterKnife.bind(this, view);
        mContext = ((T) getContext());
        initView();
        return view;
    }

    protected abstract void initView();

    protected abstract int getLayoutId();

    public void startActivity(Class<? extends BaseActivity> clazz) {
        startActivity(clazz, false);
    }

    public void startActivity(Class<? extends BaseActivity> clazz, boolean finish) {
        startActivity(clazz, null);
        if (finish) {
            mContext.finish();
        }
    }

    public void startActivity(Class<? extends BaseActivity> clazz, Bundle bundle) {
        Intent intent = new Intent(getContext(), clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public void showToast(String content) {
        ToastUtil.showToast(mContext, content);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

}
