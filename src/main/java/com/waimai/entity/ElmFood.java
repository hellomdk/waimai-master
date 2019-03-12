package com.waimai.entity;

public class ElmFood extends BaseEntity {
    private String name;
    private String food_id;    //食品id
    private String shop_id;  //店铺id
    private int month_sales;  //月售
    private float rating;//评价
    private int price;  //价格
    private int packing_fee;  //打包费

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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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

    @Override
    public String toString() {
        return "ElmFood{" +
                "name='" + name + '\'' +
                ", food_id='" + food_id + '\'' +
                ", shop_id='" + shop_id + '\'' +
                ", month_sales=" + month_sales +
                ", rating=" + rating +
                ", price=" + price +
                ", packing_fee=" + packing_fee +
                '}';
    }
}
