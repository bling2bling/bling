package com.bling.service.impl;

import com.bling.dao.ItemMapper;
import com.bling.pojo.Item;
import com.bling.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * created by leinan
 */
@Service("iItemService")
public class ItemServiceImpl implements IItemService{

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public boolean addItem(Item item) {
        int resultcount=itemMapper.insert(item);
        if(resultcount>0){
            return true;
        }
        return false;
    }

    public ArrayList<com.bling.model.Item> getItemListByCategoryId(int categoryId){
        return itemMapper.getItemListByCategoryId(categoryId);
    }

    public ArrayList<com.bling.model.Item> getAllItem(){
        return itemMapper.getAllItem();
    }

    public com.bling.model.Item getItemInfoById(int id){

        return itemMapper.getItemInfoById(id);
    }

    public boolean updateItemById(Item item){
        int result=itemMapper.updateByPrimaryKey(item);
        if(result>0){
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<com.bling.model.Item> searchItem(String search) {
        return itemMapper.searchItem(search);
    }
}
