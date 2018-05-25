package com.bling.common;
/**
 * created by leinan
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT"),
    USER_INVALID(3,"用户名不存在"),
    PWD_ERROR(4,"密码错误,try again"),
    QUESTION_NULL(5,"找回密码的问题是空的或用户名不存在"),
    USERNAME_ILLEGAL(11,"用户名必须是长度6~10的字母或数字"),
    PASSWORD_ILLEGAL(12,"密码必须是长度6~10的字母或数字"),
    EMAIL_ILLEGAL(13,"不合法的邮箱格式"),
    PHONE_ILLEGAL(14,"不合法的手机格式"),
    STATUS_ILLEGAL(15,"状态只能为0或1（0：使用中；1：不使用）");
    private final int code;
    private final String desc;
    ResponseCode(int code,String desc)
    {
        this.code=code;
        this.desc=desc;
    }
    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
