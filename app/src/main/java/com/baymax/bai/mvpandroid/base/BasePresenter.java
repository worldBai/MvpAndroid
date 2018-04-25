package com.baymax.bai.mvpandroid.base;

/**
 * Created by 86724 on 2018/1/6 0006.
 *  p层 主要处理业务逻辑
 */

public abstract class BasePresenter <TypeView extends BaseView> {

    protected abstract void attachView(TypeView view);

}
