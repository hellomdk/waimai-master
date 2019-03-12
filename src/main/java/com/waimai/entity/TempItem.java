package com.waimai.entity;


import lombok.Data;

@Data
public class TempItem {

    public String value;
    public String color="#173177";


    public TempItem(String v) {
        this.value = v;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TempItem{" +
                "value='" + value + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
