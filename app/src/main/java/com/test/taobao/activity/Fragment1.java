package com.test.taobao.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.test.taobao.R;
import com.test.taobao.adapter.RecyclerGridAdapter;
import com.test.taobao.bean.GoodsInfo;

public class Fragment1 extends BaseFragment  {
    private final static String TAG = "Fragment1";
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_item_1, null);
        // 从布局文件中获取名叫tl_head的工具栏
        Toolbar tl_head = view.findViewById(R.id.tl_head);
        // 设置工具栏的标题文字
        tl_head.setTitle("商城首页");
        // 使用tl_head替换系统自带的ActionBar
        ((AppCompatActivity)getActivity()).setSupportActionBar(tl_head);
        initGrid(); // 初始化市场网格列表
        initCombine(); // 初始化猜你喜欢的商品展示网格
        return view;
    }

    private void initGrid() {
        // 从布局文件中获取名叫rv_grid的循环视图
        RecyclerView rv_grid = view.findViewById(R.id.rv_grid);
        // 创建一个垂直方向的网格布局管理器
        GridLayoutManager manager = new GridLayoutManager(getContext(), 5);
        // 设置循环视图的布局管理器
        rv_grid.setLayoutManager(manager);
        // 构建一个市场列表的网格适配器
        RecyclerGridAdapter adapter = new RecyclerGridAdapter(this, GoodsInfo.getDefaultGrid());
        // 设置网格列表的点击监听器
        adapter.setOnItemClickListener(adapter);
        // 设置网格列表的长按监听器
        adapter.setOnItemLongClickListener(adapter);
        // 给rv_grid设置市场网格适配器
        rv_grid.setAdapter(adapter);
        // 设置rv_grid的默认动画效果
        rv_grid.setItemAnimator(new DefaultItemAnimator());
        // 给rv_grid添加列表项之间的空白装饰
        rv_grid.addItemDecoration(new SpacesItemDecoration(1));
    }
}
