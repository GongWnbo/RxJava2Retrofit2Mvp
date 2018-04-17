package com.sy.gwb.ui.activity.rent;

import android.support.annotation.NonNull;

import com.sy.gwb.BasePresenter;
import com.sy.gwb.BaseView;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;

/**
 * Created by ${GongWenbo} on 2018/4/12 0012.
 */

public interface RentContract {

    interface View extends BaseView<Presenter> {

        void showPhoneInfo(BaseResponse<QueryPhoneBean> queryPhoneBean);

        void showError(@NonNull String msg);

    }

    interface Presenter extends BasePresenter{
        void queryPhone(String phone);
    }

}
