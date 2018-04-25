package com.baymax.bai.mvpandroid.view;


import com.baymax.bai.mvpandroid.base.BasePresenter;
import com.baymax.bai.mvpandroid.base.BaseView;

/**
 * Created by 86724 on 2018/1/6 0006.
 * view 层 负责展示数据
 */

public interface MyView<PresenterType extends BasePresenter> extends BaseView {
    void setText(String string);
}
