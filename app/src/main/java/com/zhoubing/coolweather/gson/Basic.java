package com.zhoubing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/4/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;
    @SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
