package com.bling.pojo;

import java.util.Date;

public class Item {
    private Integer id;

    private Integer itemId;

    private Integer productId;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String detail;

    private Date createTime;

    private Date updateTime;

    private String size;

    private String color;

    private String length;

    private String width;

    private String higth;

    private String weight;

    private Integer price;

    private Integer stock;

    private Integer scaling;

    private Integer x;

    private Integer y;

    private String mainImage;

    private String subImages;

    private String dresserImages;

    public Item(Integer id, Integer itemId, Integer productId, Integer categoryId, String name, String subtitle, String detail, Date createTime, Date updateTime, String size, String color, String length, String width, String higth, String weight, Integer price, Integer stock, Integer scaling, Integer x, Integer y, String mainImage, String subImages, String dresserImages) {
        this.id = id;
        this.itemId = itemId;
        this.productId = productId;
        this.categoryId = categoryId;
        this.name = name;
        this.subtitle = subtitle;
        this.detail = detail;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.size = size;
        this.color = color;
        this.length = length;
        this.width = width;
        this.higth = higth;
        this.weight = weight;
        this.price = price;
        this.stock = stock;
        this.scaling = scaling;
        this.x = x;
        this.y = y;
        this.mainImage = mainImage;
        this.subImages = subImages;
        this.dresserImages = dresserImages;
    }

    public Item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length == null ? null : length.trim();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHigth() {
        return higth;
    }

    public void setHigth(String higth) {
        this.higth = higth == null ? null : higth.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getScaling() {
        return scaling;
    }

    public void setScaling(Integer scaling) {
        this.scaling = scaling;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }

    public String getDresserImages() {
        return dresserImages;
    }

    public void setDresserImages(String dresserImages) {
        this.dresserImages = dresserImages == null ? null : dresserImages.trim();
    }
}