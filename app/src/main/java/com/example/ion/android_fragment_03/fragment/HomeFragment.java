package com.example.ion.android_fragment_03.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ion.android_fragment_03.R;


public class HomeFragment extends Fragment {

    public final static String TAG = "HomeFragmentTag";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_home_fragment, null);
    }
}
