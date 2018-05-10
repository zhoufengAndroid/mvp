package com.example.zf.mvpdemo.views;

public interface IBookView {
    void onEmpty();
    void refreshData();
    void loadMoreData();
    void toast(String msg);
}
