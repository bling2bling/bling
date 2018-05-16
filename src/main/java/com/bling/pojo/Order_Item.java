package com.bling.pojo;

import java.util.Date;

public class Order_Item {
    private Integer id;

    private Long orderId;

    private Integer shippingId;

    private Integer itemId;

    private String productName;

    private String productUrl;

    private Integer currentUnitPrice;

    private Integer quantity;

    private Integer totalPrice;

    private Date createTime;

    private Date updateTime;

    public Order_Item(Integer id, Long orderId, Integer shippingId, Integer itemId, String productName, String productUrl, Integer currentUnitPrice, Integer quantity, Integer totalPrice, Date createTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.shippingId = shippingId;
        this.itemId = itemId;
        this.productName = productName;
        this.productUrl = productUrl;
        this.currentUnitPrice = currentUnitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Order_Item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public Integer getCurrentUnitPrice() {
        return currentUnitPrice;
    }

    public void setCurrentUnitPrice(Integer currentUnitPrice) {
        this.currentUnitPrice = currentUnitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
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