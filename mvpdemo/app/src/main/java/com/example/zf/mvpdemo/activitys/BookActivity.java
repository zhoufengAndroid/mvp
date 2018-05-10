package com.example.zf.mvpdemo.activitys;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.zf.mvpdemo.R;
import com.example.zf.mvpdemo.adapters.MyAdapter;
import com.example.zf.mvpdemo.base.BaseActivity;
import com.example.zf.mvpdemo.views.IBookView;
import com.example.zf.mvpdemo.presenters.BookPresenter;

public class BookActivity extends BaseActivity<BookPresenter> implements IBookView {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_book;
    }

    @Override
    protected void initView() {
        this.recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    protected void onPrepare() {
        myAdapter = new MyAdapter(presenter.getData());
        this.recyclerView.setAdapter(myAdapter);
        presenter.initData();
    }

    @Override
    protected BookPresenter initPresenter() {
        return new BookPresenter(this);
    }

    @Override
    public void onEmpty() {

    }

    @Override
    public void refreshData() {
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void loadMoreData() {
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void toast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
