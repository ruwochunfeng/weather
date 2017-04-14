package com.zhoubing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2017/4/11.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Coolw coolw;

    @SerializedName("sport")
    public Sport spot;

    public class Comfort{
        @SerializedName("txt")
        public String comftxt;

    }
    public class Coolw{
        @SerializedName("txt")
        public String cwtxt;

    }
    public class Sport{
        @SerializedName("txt")
        public String spo;

    }


}
