package com.sy.gwb.util;

import android.util.Log;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class LogUtil {

    private static boolean DE_BUG = true;

    public static void d(String tag, String msg) {
        if (DE_BUG) {
            Log.d(tag, msg);
        }
    }

}
