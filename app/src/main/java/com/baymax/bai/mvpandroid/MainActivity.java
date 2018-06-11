package com.baymax.bai.mvpandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.baymax.bai.mvpandroid.base.BaseActivity;
import com.baymax.bai.mvpandroid.base.BasePresenter;
import com.baymax.bai.mvpandroid.base.BindPresenter;
import com.baymax.bai.mvpandroid.presenter.MyPresenter;
import com.baymax.bai.mvpandroid.view.MyView;
@BindPresenter(MyPresenter.class)
public class MainActivity extends BaseActivity<MyPresenter> implements MyView {
    private TextView helloWorldTv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloWorldTv = ((TextView) findViewById(R.id.hello_world));
    }

    @Override
    protected void onResume() {
        super.onResume();
        myPresent.changeText();
    }

    @Override
    public void setText(String text) {
        helloWorldTv.setText(text);
    }



    @Override
    public BasePresenter getPresenter() {
        return new MyPresenter();
    }
}
