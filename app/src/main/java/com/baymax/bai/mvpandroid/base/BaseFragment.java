package com.baymax.bai.mvpandroid.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by 86724 on 2018/1/6 0006.
 */

public abstract class BaseFragment extends Fragment implements BaseView {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
