package com.sy.gwb;

/**
 * MVP presenter的基类
 * Created by ${GongWenbo} on 2018/4/13 0013.
 */

public interface BasePresenter {

    void subscribe();

    void unSubscribe();

    void onDestroy();

}
