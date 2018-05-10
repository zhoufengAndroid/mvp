package com.example.zf.mvpdemo.models;

import android.os.Handler;

import com.example.zf.mvpdemo.RequestCallBack;
import com.example.zf.mvpdemo.beans.Bookbean;

import java.util.ArrayList;
import java.util.List;

public class BookModel implements IBookModel {
    private List<Bookbean> bookbeans;
    public BookModel(){
        bookbeans=new ArrayList<>();
    }

    @Override
    public void requestData(final RequestCallBack requestCallBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<Bookbean> bookbeans=new ArrayList<>();
                bookbeans.add(new Bookbean("哈利波特", 1, "09-27 09:11"));
                bookbeans.add(new Bookbean("三国演义", 10, "09-27 09:11"));
                bookbeans.add(new Bookbean("老人与海", 50, "09-27 09:11"));
                bookbeans.add(new Bookbean("西游记", 300, "09-27 09:11"));
                requestCallBack.onSuccess(bookbeans);
            }
        },1000);
    }

    @Override
    public void loadMoreData(final RequestCallBack requestCallBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<Bookbean> bookbeans=new ArrayList<>();
                bookbeans.add(new Bookbean("赵云", 1, "09-27 09:11"));
                bookbeans.add(new Bookbean("赵云、隔壁老王", 10, "09-27 09:11"));
                bookbeans.add(new Bookbean("黄忠、孙权、大乔", 50, "09-27 09:11"));
                bookbeans.add(new Bookbean("大乔、小乔、貂蝉、孙尚香", 300, "09-27 09:11"));
                requestCallBack.onSuccess(bookbeans);
            }
        },1000);
    }

    @Override
    public List<Bookbean> getBooks() {
        return bookbeans;
    }
}
