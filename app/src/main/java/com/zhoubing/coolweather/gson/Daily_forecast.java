package com.zhoubing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/4/11.
 */

public class Daily_forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("cond")
    public Cod cod;

    @SerializedName("tmp")
    public Tmp tmp;

    public class Cod{
        @SerializedName("txt_d")
        public String info;

    }

    public class Tmp{
        @SerializedName("max")
        public String maxinfo;

        @SerializedName("min")
        public String mininfo;
    }

}
