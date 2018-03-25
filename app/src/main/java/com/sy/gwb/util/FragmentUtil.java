package com.sy.gwb.util;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by GongWenBo on 2018/3/24.
 */

public class FragmentUtil {

    private FragmentUtil() {
    }

    private static class FragmentUtilInterior {
        private static final FragmentUtil sFragmentUtil = new FragmentUtil();
    }

    public static FragmentUtil getInstance() {
        return FragmentUtilInterior.sFragmentUtil;
    }

    public void replace(AppCompatActivity activity,@IdRes int containerViewId, Fragment fragment){
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId,fragment)
                // TODO: 2018/3/24 此处不使用commit的原因是如果在onSaveInstanceState()方法之后调用会报Can not perform this action after onSaveInstanceState
                .commitAllowingStateLoss();
    }

    public void add(AppCompatActivity activity,@IdRes int containerViewId, Fragment fragment){
        activity.getSupportFragmentManager()
                .beginTransaction()
                .add(containerViewId,fragment)
                // TODO: 2018/3/24 此处不使用commit的原因是如果在onSaveInstanceState()方法之后调用会报Can not perform this action after onSaveInstanceState
                .commitAllowingStateLoss();
    }

}
