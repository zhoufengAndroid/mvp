package com.example.zf.mvpdemo.presenters;

import com.example.zf.mvpdemo.beans.Bookbean;

import java.util.List;

public interface IBookPresenter {
    void loadMoreData();
    List<Bookbean> getData();
}
