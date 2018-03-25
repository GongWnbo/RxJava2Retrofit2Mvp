package com.sy.gwb.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;
import com.sy.gwb.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ObservableFragment extends Fragment {


    public ObservableFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle bundle = getArguments();
        if (bundle != null) {
            String a = bundle.getString("a");
            Logger.d("ObservableFragment a=" + a);
        }
        return inflater.inflate(R.layout.fragment_observable, container, false);
    }

}