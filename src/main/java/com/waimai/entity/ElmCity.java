package com.waimai.entity;


import lombok.Data;

@Data
public class ElmCity extends BaseEntity{
    private String citytype;
    private String latitude;
    private String longitude;
    private String cityname;
    private String cityid;
    private String geohash;

    public String getCitytype() {
        return citytype;
    }

    public void setCitytype(String citytype) {
        this.citytype = citytype;
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

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    @Override
    public String toString() {
        return "ElmCity{" +
                "citytype='" + citytype + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", cityname='" + cityname + '\'' +
                ", cityid='" + cityid + '\'' +
                ", geohash='" + geohash + '\'' +
                '}';
    }
}
