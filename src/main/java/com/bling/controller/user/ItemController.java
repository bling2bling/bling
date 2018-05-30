package com.bling.controller.user;

import com.bling.model.Item;
import com.bling.service.ICategoryService;
import com.bling.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * created by leinan
 */
@Controller
@RequestMapping(value = "/user/item/")

public class ItemController {
    @Autowired
    private IItemService iItemService;
    @Autowired
    private ICategoryService iCategoryService;

    /*获得全部商品展示*/
    @RequestMapping(value = "item_list_all.do")
    public String item_list_all(HttpSession session, Model model){
        ArrayList categoryList = iCategoryService.getCategoryList();
        model.addAttribute("clist",categoryList);
        ArrayList<Item> result =iItemService.getAllItem();
        model.addAttribute("item_list",result);
        return "user/item/index";
    }

    /*获得全部商品展示*/
    @RequestMapping(value = "item_list_id.do")
    public String item_list_id(int categoryId,  Model model){
        ArrayList categoryList = iCategoryService.getCategoryList();
        model.addAttribute("clist",categoryList);
        ArrayList<Item> result =iItemService.getItemListByCategoryId(categoryId);
        model.addAttribute("item_list",result);
        return "user/item/index";
    }

    /*获得全部商品展示*/
    @RequestMapping(value = "search_list.do", method= RequestMethod.POST)
    public String search_list(String search,HttpSession session, Model model){
        ArrayList categoryList = iCategoryService.getCategoryList();
        model.addAttribute("clist",categoryList);
        System.out.println("??????!!!!!"+search);
        ArrayList<Item> result =iItemService.searchItem(search);
        model.addAttribute("item_list",result);
        return "user/item/index";
    }
}
