package com.waimai.entity;


import lombok.Data;

@Data
public class TemplateData {
    public TempItem dinner;
    public TempItem num;

    public TemplateData(TempItem dinner, TempItem num) {
        this.dinner = dinner;
        this.num = num;
    }

    public TempItem getDinner() {
        return dinner;
    }

    public void setDinner(TempItem dinner) {
        this.dinner = dinner;
    }

    public TempItem getNum() {
        return num;
    }

    public void setNum(TempItem num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "TemplateData{" +
                "dinner=" + dinner +
                ", num=" + num +
                '}';
    }
}
