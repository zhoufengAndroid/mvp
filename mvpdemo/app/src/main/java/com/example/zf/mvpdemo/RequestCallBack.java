package com.example.zf.mvpdemo;

import com.example.zf.mvpdemo.beans.Bookbean;

import java.util.List;

public interface RequestCallBack {
    void onSuccess(List<Bookbean> bookbeans);
    void onFail(String msg);
}
