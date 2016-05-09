package com.lh.dagger.view;

import android.support.v7.app.AppCompatActivity;

import com.lh.dagger.AppApplication;
import com.lh.dagger.AppComponent;

/**
 * Created by liuhui on 2016/5/9.
 * Activity基类
 */
public class BaseActivity extends AppCompatActivity
{
    AppComponent getAppcompoment()
    {
        return AppApplication.getApplication().getAppComponent();
    }
}
