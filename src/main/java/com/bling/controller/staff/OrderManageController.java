package com.bling.controller.staff;

import com.bling.pojo.Order;
import com.bling.pojo.Order_Item;
import com.bling.pojo.Shipping;
import com.bling.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/staff/order/")
public class OrderManageController {

    @Autowired
    private IOrderService iOrderService;

    /*
    * 搜索单一订单并显示详情
    * */
    @RequestMapping(value = "order_search.do")
    @ResponseBody
    public ModelAndView CheckOneOrder(@RequestParam("orderNumber") String orderNumber){
        ModelAndView order_search = new ModelAndView("staff/order/order_detail");
        //对应的订单支付等记录
        Order order_detail = iOrderService.selectByOrderNo(orderNumber);
        //订单的购物清单
        ArrayList<Order_Item> detail = iOrderService.selectItemByOrder(orderNumber);
        //订单的物流信息
        Shipping ship_detail = iOrderService.selectShipByOrderNo(orderNumber);

        order_search.addObject("order_detail",order_detail);
        order_search.addObject("detail",detail);
        order_search.addObject("ship_detail",ship_detail);
        return order_search;
    }

    /*
     * 修改订单物流信息
     */
    @RequestMapping(value = "order_update_prepare.do")
    @ResponseBody
    public ModelAndView OrderUpdPrepare(@RequestParam("ship_id") int shipping_id){
        //todo 加上订单编号为0的判断（null)
        ModelAndView order_upd_prepare = new ModelAndView("staff/order/order_update");
        //订单的物流信息
        Shipping ship_detail = iOrderService.selectByPrimaryKey(shipping_id);
        order_upd_prepare.addObject("ship_detail",ship_detail);
        return order_upd_prepare;
    }

    /*
    * 提交修改订单物流
    * */
    @RequestMapping(value = "update_order_shipment.do",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView UpdateOrderShipment(Shipping record){
        //修改内容
        int id = record.getId();
        String reciver = record.getReciver();
        String phone = record.getPhone();
        String address = record.getAddress();
        String shipping_number = record.getShippingNumber();

        if( id > 0 && reciver != null && phone != null && address != null && shipping_number != null){
            int count = iOrderService.updateShippingInfoByID(record);
            if(count > 0){
                Shipping ship_detail = iOrderService.selectByPrimaryKey(id);
                ModelAndView oreder_return_view = new ModelAndView("staff/order/order_update");
                oreder_return_view.addObject("ship_detail",ship_detail);
                return oreder_return_view;
            }
        }

        //无合法提交时跳转回修改订单物流信息的页面
        String errorMsg = "提交有误，请重新尝试";
        ModelAndView order_upd_prepare = new ModelAndView("staff/order/order_update");
        Shipping ship_detail = iOrderService.selectByPrimaryKey(id);
        order_upd_prepare.addObject("ship_detail",ship_detail);
        order_upd_prepare.addObject("errorMsg",errorMsg);
        return order_upd_prepare;
    }
}
