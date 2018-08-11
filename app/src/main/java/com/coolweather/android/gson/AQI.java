package com.coolweather.android.gson;

/**
 * 城市的空气质量实体类
 */
public class AQI {
    public  AQICity city;

    public  class AQICity{
        public String aqi;
        public String pm25;
    }
}
