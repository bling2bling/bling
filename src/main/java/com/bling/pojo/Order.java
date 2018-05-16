package com.bling.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer orderId;

    private Integer userId;

    private Integer paymentId;

    private Integer paymentStatus;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Order(Integer id, Integer orderId, Integer userId, Integer paymentId, Integer paymentStatus, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Order() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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