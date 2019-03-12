package com.waimai.entity;


import lombok.Data;


@Data
public class RecommendFood extends BaseEntity implements Comparable<RecommendFood>{
    //食品字段
    private String name;//名称
    private String food_id;//食物id
    private String shop_id;//店铺id
    private int month_sales;//月售出
    private Float rating;//评价
    private String rating_count;//评价人数
    private int price;//价格
    private int packing_fee;//打包费
    //店铺字段
    private String tips_102;  //优惠信息
    private int status;   //店铺url
    private String shopname;//店铺名称
    private String close_hour;//关门时间
    private String open_hour;//开门时间
    private int minsendprice;//起送价
    private Float delivery_fee;//配送费
    private String address;//地址

    @Override
    public int compareTo(RecommendFood o) {
        // TODO Auto-generated method stub
        if(this.rating>o.rating)
            return -1;//由高到底排序
        else if(this.rating<o.rating)
            return 1;
        else{
            if(this.rating>o.rating)
                return 1;//由底到高排序
            else if(this.rating<o.rating)
                return -1;
            else
                return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public int getMonth_sales() {
        return month_sales;
    }

    public void setMonth_sales(int month_sales) {
        this.month_sales = month_sales;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getRating_count() {
        return rating_count;
    }

    public void setRating_count(String rating_count) {
        this.rating_count = rating_count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPacking_fee() {
        return packing_fee;
    }

    public void setPacking_fee(int packing_fee) {
        this.packing_fee = packing_fee;
    }

    public String getTips_102() {
        return tips_102;
    }

    public void setTips_102(String tips_102) {
        this.tips_102 = tips_102;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getClose_hour() {
        return close_hour;
    }

    public void setClose_hour(String close_hour) {
        this.close_hour = close_hour;
    }

    public String getOpen_hour() {
        return open_hour;
    }

    public void setOpen_hour(String open_hour) {
        this.open_hour = open_hour;
    }

    public int getMinsendprice() {
        return minsendprice;
    }

    public void setMinsendprice(int minsendprice) {
        this.minsendprice = minsendprice;
    }

    public Float getDelivery_fee() {
        return delivery_fee;
    }

    public void setDelivery_fee(Float delivery_fee) {
        this.delivery_fee = delivery_fee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RecommendFood{" +
                "name='" + name + '\'' +
                ", food_id='" + food_id + '\'' +
                ", shop_id='" + shop_id + '\'' +
                ", month_sales=" + month_sales +
                ", rating=" + rating +
                ", rating_count='" + rating_count + '\'' +
                ", price=" + price +
                ", packing_fee=" + packing_fee +
                ", tips_102='" + tips_102 + '\'' +
                ", status=" + status +
                ", shopname='" + shopname + '\'' +
                ", close_hour='" + close_hour + '\'' +
                ", open_hour='" + open_hour + '\'' +
                ", minsendprice=" + minsendprice +
                ", delivery_fee=" + delivery_fee +
                ", address='" + address + '\'' +
                '}';
    }
}
