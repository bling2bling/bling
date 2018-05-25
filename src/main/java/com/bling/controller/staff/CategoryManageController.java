package com.bling.controller.staff;

import com.bling.common.Const;
import com.bling.pojo.Category;
import com.bling.pojo.Staff;
import com.bling.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "/staff/category/")
public class CategoryManageController {

    @Autowired
    private ICategoryService iCategoryService;

    /*
     * 返回商品分类页面；列举出数据库中已有的商品分类
     * */
    @RequestMapping(value = "category_list.do")
    @ResponseBody
    public ModelAndView category_list(){
            ArrayList result = iCategoryService.getCategoryList();
            ModelAndView category_list = new ModelAndView("staff/category/category_list");
            category_list.addObject("clist",result);
            return category_list;
    }

    /*
     * 添加分类，并返回结果
     * */
    @RequestMapping(value = "add_category.do",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView add_category(Category category) {
            //链接数据库添加分类，并返回结果
            int countRow = iCategoryService.addCategory(category);
            ModelAndView category_list = new ModelAndView("staff/category/category_list");

            ArrayList result = iCategoryService.getCategoryList();
            category_list.addObject("clist",result);
            if (countRow > 0) {
                //返回到商品分类页面
                return category_list;
            } else {
                //返回到商品分类页面，但需要提示添加失败
                String errorMsg = "添加失败,请重新添加";
                category_list.addObject("errorMsg",errorMsg);
                System.out.println("添加失败,请重新添加");
                return category_list;
            }
    }
}
