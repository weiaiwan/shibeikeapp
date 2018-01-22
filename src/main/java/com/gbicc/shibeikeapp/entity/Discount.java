package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class Discount {
    private String id;

    private String discountcode;

    private Byte isuse;

    private String useruse;

    private Date usetime;

    private String discountprice;

    private Date careatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDiscountcode() {
        return discountcode;
    }

    public void setDiscountcode(String discountcode) {
        this.discountcode = discountcode == null ? null : discountcode.trim();
    }

    public Byte getIsuse() {
        return isuse;
    }

    public void setIsuse(Byte isuse) {
        this.isuse = isuse;
    }

    public String getUseruse() {
        return useruse;
    }

    public void setUseruse(String useruse) {
        this.useruse = useruse == null ? null : useruse.trim();
    }

    public Date getUsetime() {
        return usetime;
    }

    public void setUsetime(Date usetime) {
        this.usetime = usetime;
    }

    public String getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(String discountprice) {
        this.discountprice = discountprice == null ? null : discountprice.trim();
    }

    public Date getCareatetime() {
        return careatetime;
    }

    public void setCareatetime(Date careatetime) {
        this.careatetime = careatetime;
    }
}