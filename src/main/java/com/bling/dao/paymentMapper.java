package com.bling.dao;

import com.bling.pojo.payment;

public interface paymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(payment record);

    int insertSelective(payment record);

    payment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(payment record);

    int updateByPrimaryKey(payment record);
}