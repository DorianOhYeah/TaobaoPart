package com.test.taobao.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import com.example.group.widget.BannerPager.BannerClickListener;
import com.test.taobao.R;

public class Fragment1 extends Fragment implements BannerClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_1, null);
        return view;
    }
}
