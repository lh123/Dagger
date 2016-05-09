package com.lh.dagger.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import com.lh.dagger.R;
import com.lh.dagger.bean.City;
import com.lh.dagger.presenter.WeatherPresenter;
import com.lh.dagger.view.modules.MainActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity implements MainView
{

    private ProgressDialog progressDialog;

    @InjectView(R.id.city_name) TextView tvCityName;
    @InjectView(R.id.city_code) TextView tvCityCode;
    @InjectView(R.id.date) TextView tvDate;
    @InjectView(R.id.publish_date) TextView tvPublishDate;
    @InjectView(R.id.city_weather) TextView tvCityWeather;

    @Inject WeatherPresenter weatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .appComponent(getAppcompoment())
                .build()
                .inject(this);
        initView();
    }

    private void initView()
    {
        ButterKnife.inject(this);
        weatherPresenter.getCityWeather("jingzhou");
    }

    @Override
    public void showProgressBar()
    {
        progressDialog=ProgressDialog.show(this,"Wait","Wait!");
    }

    @Override
    public void hideProgressBar()
    {
        if(progressDialog!=null)
        {
            progressDialog.dismiss();
        }
    }

    @Override
    public void setWeatherData(City city)
    {
        tvCityName.setText(city.getRetData().getCity());
        tvCityCode.setText(city.getRetData().getCitycode());
        tvDate.setText(city.getRetData().getDate());
        tvPublishDate.setText(city.getRetData().getPinyin());
        tvCityWeather.setText(city.getRetData().getWeather());
    }
}
