package com.sy.gwb.ui.activity.rent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sy.gwb.BaseFragment;
import com.sy.gwb.R;
import com.sy.gwb.entity.BaseResponse;
import com.sy.gwb.entity.QueryPhoneBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class QueryPhoneFragment extends BaseFragment implements QueryPhoneContract.View {


    @BindView(R.id.tv_phone)
    TextView mTvPhone;

    private QueryPhoneContract.Presenter mPresenter;

    public QueryPhoneFragment() {
    }

    public static QueryPhoneFragment newInstance() {
        return new QueryPhoneFragment();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_query_phone;
    }

    @Override
    public void setPresenter(QueryPhoneContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showPhoneSucceed(BaseResponse<QueryPhoneBean> queryPhoneBean) {
        mTvPhone.setText(queryPhoneBean.getResult().toString());
    }

    @Override
    public void showPhoneError(@NonNull String msg) {
        mTvPhone.setText(msg);
    }


    @OnClick(R.id.btn_query_phone)
    public void onViewClicked() {
        mPresenter.queryPhone("13858477182");
    }

}
