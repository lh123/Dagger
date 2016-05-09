package com.lh.dagger.presenter;

import com.lh.dagger.ActivityScope;
import com.lh.dagger.api.WeatherService;
import com.lh.dagger.bean.City;
import com.lh.dagger.view.MainView;

import javax.inject.Inject;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by liuhui on 2016/5/6.
 * 该类直接与Activity交互
 */
@ActivityScope
public class WeatherPresenter
{
    private MainView mainView;
    private WeatherService weatherService;

    @Inject
    public WeatherPresenter(MainView weatherView, WeatherService weatherService)
    {
        this.mainView = weatherView;
        this.weatherService=weatherService;
    }

    public void getCityWeather(String city)
    {
        mainView.showProgressBar();
        weatherService.getWeather(city).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<City>()
                {
                    @Override
                    public void onCompleted()
                    {
                        mainView.hideProgressBar();
                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        mainView.hideProgressBar();
                    }

                    @Override
                    public void onNext(City city)
                    {
                        mainView.setWeatherData(city);
                    }
                });
    }
}