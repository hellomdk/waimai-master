package com.waimai.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Message extends BaseEntity{

    private String openid;//微信openid
    private String foodname;//食物名称
    private String shopname;//店铺名称
    private Float price;//价格
    private Float twoprice;//两份价格
    private Float rating;  //评价
    private String shopurl;   //店铺url
    private String repeate_time;//重复时间
    private String reminder_time;//提醒时间
    private String today;//当前时间

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTwoprice() {
        return twoprice;
    }

    public void setTwoprice(Float twoprice) {
        this.twoprice = twoprice;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getShopurl() {
        return shopurl;
    }

    public void setShopurl(String shopurl) {
        this.shopurl = shopurl;
    }

    public String getRepeate_time() {
        return repeate_time;
    }

    public void setRepeate_time(String repeate_time) {
        this.repeate_time = repeate_time;
    }

    public String getReminder_time() {
        return reminder_time;
    }

    public void setReminder_time(String reminder_time) {
        this.reminder_time = reminder_time;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "Message{" +
                "openid='" + openid + '\'' +
                ", foodname='" + foodname + '\'' +
                ", shopname='" + shopname + '\'' +
                ", price=" + price +
                ", twoprice=" + twoprice +
                ", rating=" + rating +
                ", shopurl='" + shopurl + '\'' +
                ", repeate_time='" + repeate_time + '\'' +
                ", reminder_time='" + reminder_time + '\'' +
                ", today='" + today + '\'' +
                '}';
    }
}

