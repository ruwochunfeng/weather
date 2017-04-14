package com.zhoubing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/4/11.
 */

public class AQI {
    @SerializedName("city")
    public CityAqi cityAqi;

    public class CityAqi{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
