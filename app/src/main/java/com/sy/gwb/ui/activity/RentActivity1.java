package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;
import com.sy.gwb.ui.activity.rent.RentContract;
import com.sy.gwb.ui.activity.rent.RentPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RentActivity1 extends AppCompatActivity {

    private RentPresenter mRentPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        ButterKnife.bind(this);
//        mRentPresenter = new RentPresenter(this);
    }

    public void rent(View view) {
        String phone = "13858477182";
        mRentPresenter.queryPhone(phone);
    }

}
