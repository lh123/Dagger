package com.lh.dagger;

import android.app.Application;

import com.lh.dagger.api.WeatherServiceModule;

/**
 * Created by liuhui on 2016/5/8.
 * application类，提供appComponent
 */
public class AppApplication extends Application
{
    private AppComponent appComponent;
    private static AppApplication application;

    @Override
    public void onCreate()
    {
        super.onCreate();
        application=this;
        appComponent = DaggerAppComponent.builder().weatherServiceModule(new WeatherServiceModule()).build();
    }

    public static AppApplication getApplication()
    {
        return application;
    }

    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
