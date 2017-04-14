package com.zhoubing.coolweather.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.zhoubing.coolweather.db.City;
import com.zhoubing.coolweather.db.County;
import com.zhoubing.coolweather.db.Province;
import com.zhoubing.coolweather.gson.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by dell on 2017/4/5.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allprovinces = new JSONArray(response);
                for(int i =0 ;i<allprovinces.length();i++){
                    JSONObject provinceObject = allprovinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allcounty = new JSONArray(response);
                for(int i =0 ;i<allcounty.length();i++){
                    JSONObject provinceObject = allcounty.getJSONObject(i);
                    County province = new County();
                    province.setCountyName(provinceObject.getString("name"));
                    province.setWeatherId(provinceObject.getString("weather_id"));
                    province.setCityId(cityId);
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        return false;
    }

    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allcitys = new JSONArray(response);
                for(int i =0 ;i<allcitys.length();i++){
                    JSONObject cityObject = allcitys.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static Weather handleWeatherResponse(String response){
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray =jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
