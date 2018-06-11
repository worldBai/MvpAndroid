package com.baymax.bai.mvpandroid.base;

import android.app.Activity;
import android.util.Log;

public class PresenterBuilder {
    private static String TAG = "PresenterBuilder";
    public static BasePresenter builder(BaseActivity activity) throws IllegalAccessException, InstantiationException {
        Class<? extends BaseActivity> classActivity = activity.getClass();
        BasePresenter presenter = null;
        boolean hasAnnotation = classActivity.isAnnotationPresent(BindPresenter.class);
        if (hasAnnotation){
            BindPresenter annotation = (BindPresenter) classActivity.getAnnotation(BindPresenter.class);
            Class<? extends BasePresenter> presenterClass = annotation.value();
            Log.d(TAG, "builder: " + presenterClass.getName());
            presenter = presenterClass.newInstance();
        }
        return presenter;
    }
}

