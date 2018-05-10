package com.example.zf.mvpdemo.models;

import com.example.zf.mvpdemo.RequestCallBack;
import com.example.zf.mvpdemo.beans.Bookbean;

import java.util.List;

public interface IBookModel {
    void requestData(RequestCallBack requestCallBack);
    void loadMoreData(RequestCallBack requestCallBack);
    List<Bookbean> getBooks();
}
