package com.bling.controller.staff;

import com.bling.common.Const;
import com.bling.common.ServerResponse;
import com.bling.model.user;
import com.bling.pojo.Staff;
import com.bling.service.IStaffUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/staff/")
public class StaffController {
    @Autowired
    private IStaffUserService iStaffUserService;

    /*
    * 登陆
    * */
    @RequestMapping(value = "login.do",method= RequestMethod.POST)
    @ResponseBody
    public ModelAndView login(String username, String password, HttpSession session){
        if (username == null) {
            ModelAndView modelAndView = new ModelAndView("staff/error");
            modelAndView.addObject("msg","用户名不能为空");
            return modelAndView;
        }
        ServerResponse<Staff> response = iStaffUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER,response.getData());
            ModelAndView modelAndView = new ModelAndView("staff/main");
            modelAndView.addObject("username",username);
            return modelAndView;
        }
        System.out.println(response.getMsg());
        ModelAndView modelAndView=new ModelAndView("staff/error");
        modelAndView.addObject("msg",response.getMsg());
        return modelAndView;
        }

    /*
    * 新增管理员
    * */
    /*@RequestMapping(value = "add_staff.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> addStaff(Staff staff){
        return iStaffUserService.addStaff(staff);
    }*/

    /*
     * 跳转到首页
     */
    @RequestMapping(value = "staff_main.do")
    public ModelAndView staffIndex(HttpSession session){
        ModelAndView staff_index = new ModelAndView("staff/main");
        return staff_index;
    }

    @RequestMapping(value = "test.do",method = RequestMethod.POST)
    public String login(user user, Model model){
        model.addAttribute("usermodel",user);
        return "staff/category/upload";
    }
}
