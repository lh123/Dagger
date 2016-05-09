package com.lh.dagger.view;

import com.lh.dagger.bean.City;

/**
 * Created by liuhui on 2016/5/9.
 * mvp中的activity接口
 */
public interface MainView
{
    void showProgressBar();
    void hideProgressBar();
    void setWeatherData(City city);
}
