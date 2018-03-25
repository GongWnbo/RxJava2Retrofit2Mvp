package com.sy.gwb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sy.gwb.R;
import com.sy.gwb.ui.fragment.ObservableFragment;
import com.sy.gwb.ui.fragment.PayFragment;
import com.sy.gwb.ui.fragment.ProxyFragment;
import com.sy.gwb.util.FragmentFactory;
import com.sy.gwb.util.FragmentFactory1;
import com.sy.gwb.util.FragmentUtil;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        show1();
        //        show();
    }

    private void show1() {
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(ObservableFragment.class));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(ObservableFragment.class));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(ProxyFragment.class));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(ProxyFragment.class));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(PayFragment.class));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory1.createFragment(PayFragment.class));

    }

    public void show() {
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.OBSERVABLE_FRAGMENT));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.OBSERVABLE_FRAGMENT));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.PROXY_FRAGMENT));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.PROXY_FRAGMENT));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.PAY_FRAGMENT));
        FragmentUtil.getInstance().replace(this, R.id.fl, FragmentFactory.createFragment(FragmentFactory.FragmentType.PAY_FRAGMENT));
    }

}
