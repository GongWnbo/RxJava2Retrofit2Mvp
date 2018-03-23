package com.sy.gwb.ui.fragment;

import android.support.v4.app.Fragment;

import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * fragment工厂类
 * Created by ${GongWenbo} on 2018/3/22 0022.
 */

public class FragmentFactory {

    private static Map<Class<? extends Fragment>, Fragment> hm = new HashMap<>();

    public static Fragment createFragment(Class<? extends Fragment> clazz) {
        Logger.d(hm.toString());
        Fragment fragment = hm.get(clazz);
        if (hm.containsKey(fragment)) {
            return fragment;
        } else {
            try {
                fragment = clazz.newInstance();
                hm.put(clazz, fragment);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return fragment;
    }

}
