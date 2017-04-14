package com.zhoubing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/4/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temp;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info ;
    }

}
