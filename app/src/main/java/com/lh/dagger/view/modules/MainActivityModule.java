package com.lh.dagger.view.modules;

import com.lh.dagger.ActivityScope;
import com.lh.dagger.view.MainActivity;
import com.lh.dagger.view.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liuhui on 2016/5/9.
 * 提供依赖
 */
@Module
public class MainActivityModule
{
    private MainView mainActivity;

    public MainActivityModule(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }


    @ActivityScope
    @Provides
    public MainView provideMainActivity()
    {
        return mainActivity;
    }

}
