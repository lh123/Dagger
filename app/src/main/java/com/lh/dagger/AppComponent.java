package com.lh.dagger;

import com.lh.dagger.api.WeatherService;
import com.lh.dagger.api.WeatherServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liuhui on 2016/5/8.
 * appcomponent注入工具
 */
@Singleton
@Component(modules = {WeatherServiceModule.class})
public interface AppComponent
{
    WeatherService getWeatherService();
}
