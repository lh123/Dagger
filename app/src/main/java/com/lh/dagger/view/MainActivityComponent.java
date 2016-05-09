package com.lh.dagger.view;

import com.lh.dagger.ActivityScope;
import com.lh.dagger.AppComponent;
import com.lh.dagger.view.modules.MainActivityModule;
import dagger.Component;

/**
 * Created by liuhui on 2016/5/8.
 * MainActivityComponent注入工具
 */
@ActivityScope
@Component(modules = {MainActivityModule.class},dependencies = {AppComponent.class})
public interface MainActivityComponent
{
    void inject(MainActivity mainActivity);
}
