package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.presenter.RentContract;
import com.sy.gwb.presenter.RentPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RentActivity1 extends AppCompatActivity implements RentContract.View {

    private static final String TAG = "MainActivity";
    String key = "962af7c970b9fd8f7c487cf9cfa5e1ca";
    @BindView(R.id.tv_msg)
    TextView  mTvMsg;
    @BindView(R.id.iv)
    ImageView mIv;
    private RentPresenter mRentPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        ButterKnife.bind(this);
        mRentPresenter = new RentPresenter(this);
    }

    public void rent(View view) {
        String phone = "13858477182";
        mRentPresenter.queryPhone(phone);
    }

    @Override
    public void showPhoneInfo(BaseResponse<QueryPhoneBean> queryPhoneBean) {
        mTvMsg.setText(queryPhoneBean.getResult() + "");
    }

    @Override
    public void error(String msg) {
        mTvMsg.setText(msg);
    }
}
