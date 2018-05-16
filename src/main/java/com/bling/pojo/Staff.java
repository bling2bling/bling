package com.bling.pojo;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String username;

    private String password;

    private Date verifyTime;

    private String roles;

    private Date createTime;

    private Date updateTime;

    public Staff(Integer staffId, String username, String password, Date verifyTime, String roles, Date createTime, Date updateTime) {
        this.staffId = staffId;
        this.username = username;
        this.password = password;
        this.verifyTime = verifyTime;
        this.roles = roles;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
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