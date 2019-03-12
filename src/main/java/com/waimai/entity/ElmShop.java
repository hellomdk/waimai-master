package com.waimai.entity;

import lombok.Data;

import java.sql.Time;


/**
 * 饿了么商铺实体类
 */
@Data
public class ElmShop extends BaseEntity{
    private String name;
    private String status;
    private String shopid;
    private String address;
    private String tips102;
    private String latitude;//经度
    private String longitude;//纬度
    private int minsendprice;   //起送费
    private String openhour;   //开门时间
    private String closehour;  //关闭时间
    private String delivery_fee;   //配送费用
    private String order_lead_time;  //平均配送时长
    private String phone;  //手机号
    private Float rating;  //评分
    private int recent_order_num;//最近订单数量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTips102() {
        return tips102;
    }

    public void setTips102(String tips102) {
        this.tips102 = tips102;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getMinsendprice() {
        return minsendprice;
    }

    public void setMinsendprice(int minsendprice) {
        this.minsendprice = minsendprice;
    }

    public String getOpenhour() {
        return openhour;
    }

    public void setOpenhour(String openhour) {
        this.openhour = openhour;
    }

    public String getClosehour() {
        return closehour;
    }

    public void setClosehour(String closehour) {
        this.closehour = closehour;
    }

    public String getDelivery_fee() {
        return delivery_fee;
    }

    public void setDelivery_fee(String delivery_fee) {
        this.delivery_fee = delivery_fee;
    }

    public String getOrder_lead_time() {
        return order_lead_time;
    }

    public void setOrder_lead_time(String order_lead_time) {
        this.order_lead_time = order_lead_time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getRecent_order_num() {
        return recent_order_num;
    }

    public void setRecent_order_num(int recent_order_num) {
        this.recent_order_num = recent_order_num;
    }

    @Override
    public String toString() {
        return "ElmShop{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", shopid='" + shopid + '\'' +
                ", address='" + address + '\'' +
                ", tips102='" + tips102 + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", minsendprice=" + minsendprice +
                ", openhour='" + openhour + '\'' +
                ", closehour='" + closehour + '\'' +
                ", delivery_fee='" + delivery_fee + '\'' +
                ", order_lead_time='" + order_lead_time + '\'' +
                ", phone='" + phone + '\'' +
                ", rating=" + rating +
                ", recent_order_num=" + recent_order_num +
                '}';
    }
}
