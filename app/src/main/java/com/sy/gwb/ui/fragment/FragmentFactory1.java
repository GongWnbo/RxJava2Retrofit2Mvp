package com.sy.gwb.ui.fragment;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

import static com.sy.gwb.ui.fragment.FragmentFactory1.FragmentType.OBSERVABLE;
import static com.sy.gwb.ui.fragment.FragmentFactory1.FragmentType.PROXY;


/**
 * fragment工厂类
 * Created by ${GongWenbo} on 2018/3/22 0022.
 */

public class FragmentFactory1 {


    private static Map<FragmentType, Fragment> hm = new HashMap<>();

    public static Fragment createFragment(FragmentType type) {
        Fragment fragment = hm.get(type);
        if (fragment != null) {
            return fragment;
        }
        FragmentType position = PROXY;
        switch (type) {
            case PROXY:
                fragment = new ProxyFragment();
                position = PROXY;
                break;
            case OBSERVABLE:
                fragment = new ObservableFragment();
                position = OBSERVABLE;
                break;
        }
        hm.put(position, fragment);
        return fragment;
    }

    public enum FragmentType {
        PROXY,              // 代理
        OBSERVABLE          // 观察者
    }

}
