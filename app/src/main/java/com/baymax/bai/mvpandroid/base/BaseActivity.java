package com.baymax.bai.mvpandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 86724 on 2018/1/6 0006.
 *
 */

public abstract class BaseActivity <PresenterType extends BasePresenter> extends AppCompatActivity implements BaseView {
    protected PresenterType myPresent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myPresent = (PresenterType) getPresenter();
        myPresent.attachView(this);
    }


}
