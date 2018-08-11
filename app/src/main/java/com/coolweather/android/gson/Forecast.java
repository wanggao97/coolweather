package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 未来多天预测
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;  //温度

    @SerializedName("cond")
    public  More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public  String info;
    }
}
