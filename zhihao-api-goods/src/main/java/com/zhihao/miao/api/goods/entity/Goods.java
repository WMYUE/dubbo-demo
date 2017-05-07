package com.zhihao.miao.api.goods.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.zhihao.miao.api.goods.utils.CustomDateSerializer;
import com.zhihao.miao.common.validator.Not999;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{

    @Min(900)
    @Not999 //这个为自定义的验证标签
    private long goodsId;

    private String title;

    private float price;

    private short state;//0表示下架 1表示正常

    private int number;

    //这里展示了jackson封装好的以及自定义的对时间格式的转换方式
    //后续对于一些复杂的转换可以自定义转换方式
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date updateTime;

    public long getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public short getState() {
        return state;
    }
    public void setState(short state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Goods [goodsId=" + goodsId + ", title=" + title + ", price=" + price + ", state=" + state + ", number=" + number + ", createTime="
                + createTime + ", updateTime=" + updateTime + "]";
    }
}
