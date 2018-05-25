package com.bling.service.impl;

import com.bling.dao.OrderMapper;
import com.bling.dao.Order_ItemMapper;
import com.bling.pojo.Order;
import com.bling.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;
    private Order_ItemMapper order_itemMapper;



}
