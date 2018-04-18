package com.sy.gwb.ui.activity.rent;

import android.support.v4.app.FragmentManager;

import com.sy.gwb.BaseActivity;
import com.sy.gwb.R;
import com.sy.gwb.util.ActivityUtils;

public class QueryPhoneActivity extends BaseActivity {

    @Override
    protected void initView() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        QueryPhoneFragment fragment = QueryPhoneFragment.newInstance();
        ActivityUtils.addFragmentToActivity(supportFragmentManager, fragment, R.id.fl);
        new QueryPhonePresenter(fragment,this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_query_phone;
    }

}
