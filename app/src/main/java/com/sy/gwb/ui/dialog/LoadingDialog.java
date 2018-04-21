package com.sy.gwb.ui.dialog;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sy.gwb.R;

import butterknife.BindView;

/**
 * Created by ${GongWenbo} on 2018/4/21 0021.
 */

public class LoadingDialog extends BaseDialog {


    @BindView(R.id.iv_loading)
    ImageView mIvLoading;

    @Override
    protected void init() {
        setCancelable(false);
        Glide.with(getActivity()).load(R.mipmap.icon_loading).into(mIvLoading);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_loading;
    }

}
