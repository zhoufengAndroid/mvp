package com.example.zf.mvpdemo.presenters;

import com.example.zf.mvpdemo.RequestCallBack;
import com.example.zf.mvpdemo.base.BasePresenter;
import com.example.zf.mvpdemo.beans.Bookbean;
import com.example.zf.mvpdemo.models.IBookModel;
import com.example.zf.mvpdemo.views.IBookView;
import com.example.zf.mvpdemo.models.BookModel;

import java.util.List;

public class BookPresenter extends BasePresenter implements IBookPresenter {

    private IBookView mView;
    private IBookModel mModel;

    public BookPresenter(IBookView mView) {
        this.mView = mView;
        this.mModel=new BookModel();
    }

    @Override
    public void initData() {
        mModel.requestData(new RequestCallBack() {
            @Override
            public void onSuccess(List<Bookbean> bookbeans) {
                List<Bookbean> books = mModel.getBooks();
                books.clear();
                books.addAll(bookbeans);
                mView.refreshData();
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }

    @Override
    public void loadMoreData() {
        mModel.loadMoreData(new RequestCallBack() {
            @Override
            public void onSuccess(List<Bookbean> bookbeans) {
                mModel.getBooks().addAll(bookbeans);
                mView.loadMoreData();
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }

    @Override
    public List<Bookbean> getData() {
        return mModel.getBooks();
    }


}
