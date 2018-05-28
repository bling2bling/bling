package com.bling.dao;

import com.bling.pojo.Item;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;

import java.util.ArrayList;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    ArrayList<com.bling.model.Item> getItemListByCategoryId(int categoryId);

    com.bling.model.Item getItemInfoById(int id);
}