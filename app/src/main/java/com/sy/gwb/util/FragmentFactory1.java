package com.sy.gwb.util;

import android.support.v4.app.Fragment;

import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 用反射的方式，个人喜欢这种方式
 * Created by GongWenBo on 2018/3/24.
 */

public class FragmentFactory1 {

    // TODO: 2018/3/24 ? extends 您可以写成你的BaseFragment
    private static Map<Class<? extends Fragment>, Fragment> sFragmentMap = new HashMap<>();

    public static Fragment createFragment(Class<? extends Fragment> clazz) {
        // TODO: 2018/3/24 打印日志,引用的是第三方的类库, 您可以换成你自己的
        Logger.d(sFragmentMap.toString());
        if (sFragmentMap.containsKey(clazz)) {
            return sFragmentMap.get(clazz);
        }
        try {
            Fragment fragment = clazz.newInstance();
            sFragmentMap.put(clazz, fragment);
            return fragment;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("fragment is not exist");
    }

}
