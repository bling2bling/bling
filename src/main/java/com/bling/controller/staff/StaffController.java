package com.bling.controller.staff;

import com.bling.common.Const;
import com.bling.common.ResponseCode;
import com.bling.common.ServerResponse;
import com.bling.pojo.Staff;
import com.bling.pojo.User;
import com.bling.service.IStaffUserService;
import com.bling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * created by leinan
 */
@Controller
@RequestMapping(value = "/staff/")
public class StaffController {
    @Autowired
    private IStaffUserService iStaffUserService;

    @RequestMapping(value = "login.do",method= RequestMethod.POST)
    @ResponseBody
    public ModelAndView login(String username, String password, HttpSession session){

        if (username == null) {
            ModelAndView modelAndView=new ModelAndView("staff/login");
            return modelAndView;
        }
        System.out.println("**********"+username);
        ServerResponse<Staff> response = iStaffUserService.login(username, password);

        if (response.isSuccess()) {
            ModelAndView modelAndView=new ModelAndView("staff/main");
            modelAndView.addObject("username",username);
            return modelAndView;
        }

        ModelAndView modelAndView=new ModelAndView("staff/login");
        return modelAndView;
        }

//    @RequestMapping(value = "add_staff.do",method = RequestMethod.POST)
//    @ResponseBody
//    public ServerResponse<String> addStaff(Staff staff){
//        return iStaffUserService.addStaff(staff);
//    }
}
