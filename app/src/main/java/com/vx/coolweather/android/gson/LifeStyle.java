package com.vx.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class LifeStyle {
    @SerializedName("brf")
    public String brf;  //生活指数

    @SerializedName("txt")
    public String info; //具体描述

    @SerializedName("type")
    public String type;  //哪方面的生活指数
}
