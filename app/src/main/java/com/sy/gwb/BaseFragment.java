package com.sy.gwb;

import android.app.Activity;
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
public abstract class BaseFragment extends Fragment {

    private Unbinder unbinder;

    public BaseFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        unbinder = ButterKnife.bind(this, view);
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
            ((Activity) getContext()).finish();
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
        ToastUtil.showToast(getContext(), content);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
