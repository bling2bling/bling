package com.bling.service;

import com.bling.pojo.Item;

import java.util.ArrayList;

public interface IItemService {
    boolean addItem(Item item);

    ArrayList<com.bling.model.Item> getItemListByCategoryId(int categoryId);

    com.bling.model.Item getItemInfoById(int id);

    boolean updateItemById(Item item);
}
