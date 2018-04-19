package com.sy.gwb.net;

import com.sy.gwb.App;

import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * Created by GongWenBo on 2018/4/19.
 */

public class CacheProviders {

    private static CacheProvider userCacheProviders;

    public synchronized static CacheProvider getUserCache() {
        if (userCacheProviders == null) {
            userCacheProviders = new RxCache.Builder()
                    .persistence(App.getApplication().getExternalCacheDir(), new GsonSpeaker())//缓存文件的配置、数据的解析配置
                    .using(CacheProvider.class);//这些配置对应的缓存接口
        }
        return userCacheProviders;
    }

}
