package com.zhihao.miao.api.goods.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.zhihao.miao.api.goods.utils.CustomDateSerializer;

import java.io.Serializable;
import java.util.Date;

public class Order  implements Serializable {

    private long orderId;

    private BIConversion.User user;

    private long goodsId;

    private String title;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createTime;


    public BIConversion.User getUser() {
        return user;
    }


    public void setUser(BIConversion.User user) {
        this.user = user;
    }


    public long getOrderId() {
        return orderId;
    }


    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public long getGoodsId() {
        return goodsId;
    }


    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }


    @Override
    public String toString() {
        return "Order [user=" + user + ", orderId=" + orderId + ", goodsId=" + goodsId + ", title=" + title + ", createTime=" + createTime + "]";
    }

}

