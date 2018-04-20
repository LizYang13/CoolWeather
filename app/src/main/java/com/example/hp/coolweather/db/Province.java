package com.example.hp.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author liz
 * @version V1.0
 * @date 2018/4/20
 */

public class Province extends DataSupport {

    private  int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
