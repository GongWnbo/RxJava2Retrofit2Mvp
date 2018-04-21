package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.sy.gwb.R;
import com.sy.gwb.adapter.BaseAdapter;
import com.sy.gwb.adapter.BaseViewHolder;
import com.sy.gwb.adapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DiscountCouponActivity extends AppCompatActivity implements BaseAdapter.BaseAdapterListener<String>, OnItemClickListener {

    @BindView(R.id.rv_show)
    RecyclerView mRvShow;

    private List<String> mList = new ArrayList<>();
    private int         prePosition;            // 之前的位置
    private int         currentPosition;        // 当前的位置
    private BaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_coupon);
        ButterKnife.bind(this);
        for (int i = 0; i < 10; i++) {
            mList.add("");
        }
        // 这个没什么好说的
        mAdapter = new BaseAdapter(mList, this, R.layout.item_discount_coupons, this);
        mRvShow.setLayoutManager(new LinearLayoutManager(this));
        mRvShow.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }


    @Override
    public void convert(final BaseViewHolder holder, String str) {
        int layoutPosition = holder.getLayoutPosition();
        holder.setVisible(R.id.view, layoutPosition == mList.size() - 1);
        ImageView iv_select = holder.getView(R.id.iv_select);
        holder.setVisible(R.id.iv_select);
        if (layoutPosition == currentPosition) {
            iv_select.setImageResource(R.mipmap.green_selected);
        } else {
            iv_select.setImageResource(R.mipmap.normal_selected);
        }
    }

    @Override
    public void onItemClick(int position) {
        // TODO: 2018/4/18 如果是相同的不设置
        if (prePosition != position) {
            currentPosition = position;
            mAdapter.notifyItemChanged(position);
            mAdapter.notifyItemChanged(prePosition);
            prePosition = position;
        }
    }
}
