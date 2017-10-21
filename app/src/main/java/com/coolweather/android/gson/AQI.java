package com.coolweather.android.gson;

/**
 * Created by 雪虎 on 2017/10/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
