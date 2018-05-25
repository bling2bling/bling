package com.bling.controller.staff;

import com.bling.pojo.Order;
import com.bling.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/staff/order/")
public class OrderManageController {

    @Autowired
    private IOrderService iOrderService;

    /*
    * 订单管理首页
    * */
    @RequestMapping(value = "order_list.do")
    @ResponseBody
    public ModelAndView CheckOneOrder(){
        ModelAndView orderIndex = new ModelAndView("staff/order/order_index");
        return orderIndex;
    }


}
