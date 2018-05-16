package com.bling.pojo;

import java.util.Date;

public class Shipping {
    private Integer id;

    private String shippingNumber;

    private Integer orderId;

    private String address;

    private String reciver;

    private String phone;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Shipping(Integer id, String shippingNumber, Integer orderId, String address, String reciver, String phone, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.shippingNumber = shippingNumber;
        this.orderId = orderId;
        this.address = address;
        this.reciver = reciver;
        this.phone = phone;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Shipping() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber == null ? null : shippingNumber.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver == null ? null : reciver.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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