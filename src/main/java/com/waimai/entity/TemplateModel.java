package com.waimai.entity;


import lombok.Data;

@Data
public class TemplateModel {
    public String touser ;     //模板openid
    public String template_id;   //模板id
    public String url; //模板详情url

    public String topcolor;  //顶部颜色

    public TemplateData data ;

    public TemplateModel(String dinner,String num) {
        this.data= new TemplateData(
                new TempItem(dinner),
                new TempItem(num)
        );

    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopcolor() {
        return topcolor;
    }

    public void setTopcolor(String topcolor) {
        this.topcolor = topcolor;
    }

    public TemplateData getData() {
        return data;
    }

    public void setData(TemplateData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TemplateModel{" +
                "touser='" + touser + '\'' +
                ", template_id='" + template_id + '\'' +
                ", url='" + url + '\'' +
                ", topcolor='" + topcolor + '\'' +
                ", data=" + data +
                '}';
    }
}
