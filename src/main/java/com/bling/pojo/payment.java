package com.bling.pojo;

import java.util.Date;

public class payment {
    private Integer id;

    private Integer orderId;

    private Integer totalAmount;

    private Integer payWay;

    private Date createTime;

    private Date updateTime;

    public payment(Integer id, Integer orderId, Integer totalAmount, Integer payWay, Date createTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.payWay = payWay;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public payment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
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
}