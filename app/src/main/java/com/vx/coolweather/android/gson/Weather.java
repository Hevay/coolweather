package com.vx.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;

    public Basic basic;

    public Now now;

    @SerializedName("lifestyle")
    public List<LifeStyle> lifeStyleList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
