package com.baymax.bai.mvpandroid.base;

/**
 * Created by 86724 on 2018/1/6 0006.
 */

public interface BaseView<PresenterType extends BasePresenter> {
    PresenterType getPresenter();
}
