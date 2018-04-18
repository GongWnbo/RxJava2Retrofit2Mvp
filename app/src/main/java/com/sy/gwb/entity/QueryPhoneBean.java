package com.sy.gwb.entity;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class QueryPhoneBean {

    /**
     * areacode : 0571
     * card :
     * city : 杭州
     * company : 中国移动
     * province : 浙江
     * zip : 310000
     */

    private String areacode;
    private String card;
    private String city;
    private String company;
    private String province;
    private String zip;

    @Override
    public String toString() {
        return "areacode=" + areacode + ",card=" + card + ",city=" + city + ",company=" + company
                + ",province=" + province + ",zip=" + zip;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
