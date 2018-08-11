package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市的当时(now)天气类
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;  //温度

    @SerializedName("cond")
    public More more;   //更多

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
