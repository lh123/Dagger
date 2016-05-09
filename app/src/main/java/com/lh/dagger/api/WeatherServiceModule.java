package com.lh.dagger.api;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by liuhui on 2016/5/6.
 * 提供依赖
 */
@Module
public class WeatherServiceModule
{
    @Singleton
    @Provides
    OkHttpClient provideOkhttpClient()
    {
        return new OkHttpClient.Builder()
                .connectTimeout(3000, TimeUnit.MILLISECONDS)
                .readTimeout(3000,TimeUnit.MILLISECONDS)
                .writeTimeout(3000,TimeUnit.MILLISECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit()
    {
        return new Retrofit.Builder()
                .baseUrl("http://apistore.baidu.com/microservice/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    WeatherService provideWeatherService(Retrofit retrofit)
    {
        return retrofit.create(WeatherService.class);
    }
}
