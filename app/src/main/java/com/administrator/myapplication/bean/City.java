package com.administrator.myapplication.bean;

/**
 * Created by Administrator on 2016/10/12.
 */
public class City {

    private String province;
    private String city;
    private String number;
    private String firstPy;
    private String allPy;
    private String allFirstPy;

    public City() {
    }

    public City(String province, String city, String number, String firstPy, String allPy, String allFirstPy) {
        this.province = province;
        this.city = city;
        this.number = number;
        this.firstPy = firstPy;
        this.allPy = allPy;
        this.allFirstPy = allFirstPy;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstPy() {
        return firstPy;
    }

    public void setFirstPy(String firstPy) {
        this.firstPy = firstPy;
    }

    public String getAllPy() {
        return allPy;
    }

    public void setAllPy(String allPy) {
        this.allPy = allPy;
    }

    public String getAllFirstPy() {
        return allFirstPy;
    }

    public void setAllFirstPy(String allFirstPy) {
        this.allFirstPy = allFirstPy;
    }
}
