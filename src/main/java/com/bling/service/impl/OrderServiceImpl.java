package com.bling.service.impl;

import com.bling.dao.OrderMapper;
import com.bling.dao.Order_ItemMapper;
import com.bling.dao.ShippingMapper;
import com.bling.pojo.Order;
import com.bling.pojo.Order_Item;
import com.bling.pojo.Shipping;
import com.bling.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private Order_ItemMapper order_itemMapper;
    @Autowired
    private ShippingMapper shippingMapper;

    public ArrayList<Order_Item> selectItemByOrder(String OrderID){
        return order_itemMapper.selectItemByOrder(OrderID);
    }

    public Order selectByOrderNo(String OrderID){
        return orderMapper.selectByOrderNo(OrderID);
    }

    public Shipping selectShipByOrderNo(String OrderID){
        return shippingMapper.selectShipByOrderNo(OrderID);
    }

    public Shipping selectByPrimaryKey(int ID){
        return shippingMapper.selectByPrimaryKey(ID);
    }

    public int updateShippingInfoByID(Shipping record){
        return shippingMapper.updateShippingInfoByID(record);
    }

}
