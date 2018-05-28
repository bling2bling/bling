package com.bling.service;

import com.bling.pojo.Order;
import com.bling.pojo.Order_Item;
import com.bling.pojo.Shipping;

import java.util.ArrayList;

public interface IOrderService {

    ArrayList<Order_Item> selectItemByOrder(String OrderID);

    Order selectByOrderNo(String order_id);

    Shipping selectShipByOrderNo(String OrderID);

    Shipping selectByPrimaryKey(int id);

    int updateShippingInfoByID(Shipping record);
}
