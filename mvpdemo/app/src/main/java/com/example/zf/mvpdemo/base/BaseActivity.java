package com.example.zf.mvpdemo.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected T presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        presenter=initPresenter();
        onPrepare();
    }

    protected abstract int getLayoutId();
    protected abstract void initView();
    protected abstract void onPrepare();
    protected abstract T initPresenter();
}
