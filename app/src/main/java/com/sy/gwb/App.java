package com.sy.gwb;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.sy.gwb.net.CacheProvider;

import java.io.File;

import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class App extends Application {

    private static CacheProvider mCacheProvider;

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public CacheProvider getCacheProvider() {
        File file = getCacheDir();
        if (mCacheProvider == null) {
            mCacheProvider = new RxCache.Builder()
                    .persistence(file, new GsonSpeaker()).using(CacheProvider.class);
        }
        return mCacheProvider;
    }

}
