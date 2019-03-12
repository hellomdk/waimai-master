package com.waimai.entity;


import lombok.Data;

@Data
public class Mycount extends BaseEntity{
    private String openid;
    private String taste;//口味
    private String reminder_time;//提醒时间
    private String repeate_time;
    private String latitude;
    private String longitude;
    private String geohash;
    private String address;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getReminder_time() {
        return reminder_time;
    }

    public void setReminder_time(String reminder_time) {
        this.reminder_time = reminder_time;
    }

    public String getRepeate_time() {
        return repeate_time;
    }

    public void setRepeate_time(String repeate_time) {
        this.repeate_time = repeate_time;
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

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mycount{" +
                "openid='" + openid + '\'' +
                ", taste='" + taste + '\'' +
                ", reminder_time='" + reminder_time + '\'' +
                ", repeate_time='" + repeate_time + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", geohash='" + geohash + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

