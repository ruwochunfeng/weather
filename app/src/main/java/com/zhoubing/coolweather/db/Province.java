package com.zhoubing.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dell on 2017/4/5.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;

    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
