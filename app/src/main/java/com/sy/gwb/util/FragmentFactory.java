package com.sy.gwb.util;

import android.support.v4.app.Fragment;

import com.orhanobut.logger.Logger;
import com.sy.gwb.ui.fragment.ObservableFragment;
import com.sy.gwb.ui.fragment.PayFragment;
import com.sy.gwb.ui.fragment.ProxyFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * 用枚举,耦合性大,新加类需要修改代码,个人感觉不是太好
 * Created by GongWenBo on 2018/3/24.
 */

public class FragmentFactory {

    private static final Map<FragmentType, Fragment> sFragmentMap = new HashMap<>();

    public static Fragment createFragment(FragmentType type) {
        // TODO: 2018/3/24 打印日志,引用的是第三方的类库, 您可以换成你自己的
        Logger.d(sFragmentMap.toString());
        if (sFragmentMap.containsKey(type)) {
            return sFragmentMap.get(type);
        }
        Fragment fragment = null;
        switch (type) {
            case PAY_FRAGMENT:
                fragment = new PayFragment();
                break;
            case PROXY_FRAGMENT:
                fragment = new ProxyFragment();
                break;
            case OBSERVABLE_FRAGMENT:
                fragment = new ObservableFragment();
                break;
        }
        sFragmentMap.put(type, fragment);
        return fragment;
    }

    public enum FragmentType {
        PAY_FRAGMENT,           // 支付
        PROXY_FRAGMENT,         // 代理
        OBSERVABLE_FRAGMENT     // 观察者
    }
}
