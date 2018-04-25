package com.baymax.bai.mvpandroid.presenter;

import com.baymax.bai.mvpandroid.base.BasePresenter;
import com.baymax.bai.mvpandroid.view.MyView;

/**
 * Created by 86724 on 2018/1/6 0006.
 */

public class MyPresenter extends BasePresenter<MyView> {
    protected MyView myView;

    @Override
    public void attachView(MyView view) {
        this.myView = view;
    }

    public void changeText(){
        myView.setText("MyPresenter Hello world");
    }
}
