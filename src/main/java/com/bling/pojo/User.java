package com.bling.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String mobilePhone;

    private String question;

    private String answer;

    private Date verifiedTime;

    private String dresser1;

    private String dresser2;

    private String dresser3;

    private String dresser4;

    private String address1;

    private String phone1;

    private String address2;

    private String phone2;

    private String address3;

    private String phone3;

    private Integer role;

    private Date createTime;

    private Date updateTime;

    public User(Integer id, String username, String password, String email, String mobilePhone, String question, String answer, Date verifiedTime, String dresser1, String dresser2, String dresser3, String dresser4, String address1, String phone1, String address2, String phone2, String address3, String phone3, Integer role, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.question = question;
        this.answer = answer;
        this.verifiedTime = verifiedTime;
        this.dresser1 = dresser1;
        this.dresser2 = dresser2;
        this.dresser3 = dresser3;
        this.dresser4 = dresser4;
        this.address1 = address1;
        this.phone1 = phone1;
        this.address2 = address2;
        this.phone2 = phone2;
        this.address3 = address3;
        this.phone3 = phone3;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Date getVerifiedTime() {
        return verifiedTime;
    }

    public void setVerifiedTime(Date verifiedTime) {
        this.verifiedTime = verifiedTime;
    }

    public String getDresser1() {
        return dresser1;
    }

    public void setDresser1(String dresser1) {
        this.dresser1 = dresser1 == null ? null : dresser1.trim();
    }

    public String getDresser2() {
        return dresser2;
    }

    public void setDresser2(String dresser2) {
        this.dresser2 = dresser2 == null ? null : dresser2.trim();
    }

    public String getDresser3() {
        return dresser3;
    }

    public void setDresser3(String dresser3) {
        this.dresser3 = dresser3 == null ? null : dresser3.trim();
    }

    public String getDresser4() {
        return dresser4;
    }

    public void setDresser4(String dresser4) {
        this.dresser4 = dresser4 == null ? null : dresser4.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3 == null ? null : address3.trim();
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3 == null ? null : phone3.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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