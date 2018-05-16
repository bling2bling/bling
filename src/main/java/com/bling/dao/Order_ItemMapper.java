package com.bling.dao;

import com.bling.pojo.Order_Item;

public interface Order_ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_Item record);

    int insertSelective(Order_Item record);

    Order_Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_Item record);

    int updateByPrimaryKey(Order_Item record);
}