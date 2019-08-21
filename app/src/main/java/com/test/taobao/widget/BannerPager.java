package com.test.taobao.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class BannerPager extends RelativeLayout implements View.OnClickListener {
    private static final String TAG = "BannerPager";
    private Context mContext; // 声明一个上下文对象
    private ViewPager vp_banner; // 声明一个翻页视图对象
    private RadioGroup rg_indicator; // 声明一个单选组对象
    private List<ImageView> mViewList = new ArrayList<ImageView>(); // 声明一个图像视图队列
    private int mInterval = 2000; // 轮播的时间间隔，单位毫秒

    public BannerPager(Context context) {
        this(context, null);
    }

    public BannerPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }
}
