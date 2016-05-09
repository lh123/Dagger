package com.lh.dagger.api;

import com.lh.dagger.bean.City;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by liuhui on 2016/5/6.
 * RESTApi
 */
public interface WeatherService
{
    @GET("weather")
    Observable<City> getWeather(@Query("citypinyin")String city);
}
