package com.sy.gwb.presenter;

import android.support.annotation.NonNull;

import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;

/**
 * Created by ${GongWenbo} on 2018/4/12 0012.
 */

public interface RentContract {

    interface View {
        void showPhoneInfo(BaseResponse<QueryPhoneBean> queryPhoneBean);

        void error(@NonNull String msg);

    }

    interface Presenter {
        void queryPhone(String phone);
    }

}
