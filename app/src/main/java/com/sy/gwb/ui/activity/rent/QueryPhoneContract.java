package com.sy.gwb.ui.activity.rent;

import android.support.annotation.NonNull;

import com.sy.gwb.BasePresenter;
import com.sy.gwb.BaseView;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean1;

/**
 * Created by ${GongWenbo} on 2018/4/12 0012.
 */

public interface QueryPhoneContract {

    interface View extends BaseView<Presenter> {

        void showPhoneSucceed(BaseResponse<QueryPhoneBean1> queryPhoneBean);

        void showPhoneError(@NonNull String msg);

    }

    interface Presenter extends BasePresenter {

        void queryPhone(String phone);

    }

}
