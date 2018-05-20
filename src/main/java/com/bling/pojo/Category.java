package com.bling.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class Category {

    private Integer id;

    @NotNull(message = "品类编号不能为空")
    private Integer categoryId;

    @NotNull(message = "品类名称不能为空")
    private String categoryName;

    @Min(value=0)
    @Max(value = 1)
    private Integer status;

    private String detail;

    private Date createTime;

    private Date updateTime;

    public Category(Integer id, Integer categoryId, String categoryName, Integer status, String detail, Date createTime, Date updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.status = status;
        this.detail = detail;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Category() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}