package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市的天气基本信息
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;  //最后更新时间

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
