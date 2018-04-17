package com.sy.gwb.ui.activity.rent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sy.gwb.R;

import butterknife.ButterKnife;

public class RentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        ButterKnife.bind(this);
    }

}
