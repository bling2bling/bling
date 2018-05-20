package com.bling.controller.staff;

import com.bling.common.Const;
import com.bling.common.ResponseCode;
import com.bling.common.ServerResponse;
import com.bling.pojo.Category;
import com.bling.pojo.Staff;
import com.bling.pojo.User;
import com.bling.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * created by leinan
 */
@Controller
@RequestMapping(value = "/staff/category/")
public class CategoryManageController {

    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("add_category.do")
    @ResponseBody
    public ServerResponse add_category(@Valid Category category, BindingResult br, HttpSession session) {
        try {
            Staff staff = (Staff) session.getAttribute(Const.CURRENT_USER);
            if (staff == null) {
                return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录");
            }
            if (br.hasErrors()) {
                return ServerResponse.createByErrorCodeMessage(ResponseCode.STATUS_ILLEGAL.getCode(), ResponseCode.STATUS_ILLEGAL.getDesc());
            }
            return iCategoryService.addCategory(category);
        } catch (ClassCastException CE ) {
            return ServerResponse.createByErrorMessage("没有操作权限");
        }
    }
}
