package com.bling.controller.user;

import com.bling.common.Const;
import com.bling.common.ResponseCode;
import com.bling.common.ServerResponse;
import com.bling.pojo.User;
import com.bling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * Created by leinan
 */
@Controller
@RequestMapping("/user/")
public class UserController {


    @Autowired
    private IUserService iUserService;


    /*用户登录*/
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session) {
            if (username == null) {
                return null;
            }
            ServerResponse<User> response = iUserService.login(username, password);
            if (response.isSuccess()) {
                session.setAttribute(Const.CURRENT_USER, response.getData());
            }
            return response;
        }


    @RequestMapping(value = "logout.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user){
        Pattern name=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        Pattern password=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        Pattern email=Pattern.compile("^[\\w-]+@[\\w-]+(\\.[\\w-]+)+$");
        Pattern phone=Pattern.compile("^1((3[0-9])|(4[5|7])|(5([0-3]|[5-9]))|（70）|(8[0,5-9]))\\d{8}$");
        if(user.getUsername()==null||!name.matcher(user.getUsername()).matches()){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.USERNAME_ILLEGAL.getCode(),ResponseCode.USERNAME_ILLEGAL.getDesc());
        }
        if(user.getPassword()==null||!password.matcher(user.getPassword()).matches()){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.PASSWORD_ILLEGAL.getCode(),ResponseCode.PASSWORD_ILLEGAL.getDesc());
        }
        if(user.getEmail()==null||!email.matcher(user.getEmail()).matches()){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.EMAIL_ILLEGAL.getCode(),ResponseCode.EMAIL_ILLEGAL.getDesc());
        }
        if(user.getMobilePhone()!=null){
            if(!phone.matcher(user.getMobilePhone()).matches()){
                return ServerResponse.createByErrorCodeMessage(ResponseCode.PHONE_ILLEGAL.getCode(),ResponseCode.PHONE_ILLEGAL.getDesc());
            }
        }
        return iUserService.register(user);
    }


    @RequestMapping(value = "check_valid.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str,String type){
        return iUserService.checkValid(str,type);
    }

    @RequestMapping(value = "get_user_info.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户的信息");
    }


    @RequestMapping(value = "forget_get_question.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserService.selectQuestion(username);
    }


    @RequestMapping(value = "forget_check_answer.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer){
        return iUserService.checkAnswer(username,question,answer);
    }


    @RequestMapping(value = "forget_reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken){
        Pattern password=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        if(passwordNew==null||!password.matcher(passwordNew).matches()){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.PASSWORD_ILLEGAL.getCode(),ResponseCode.PASSWORD_ILLEGAL.getDesc());
        }
        return iUserService.forgetResetPassword(username,passwordNew,forgetToken);
    }



    @RequestMapping(value = "reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> resetPassword(HttpSession session,String passwordOld,String passwordNew){
        Pattern password=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        if(passwordNew==null||!password.matcher(passwordNew).matches()){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.PASSWORD_ILLEGAL.getCode(),ResponseCode.PASSWORD_ILLEGAL.getDesc());
        }
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserService.resetPassword(passwordOld,passwordNew,user);
    }


    @RequestMapping(value = "update_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> update_information(HttpSession session,User user){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setId(currentUser.getId());
        user.setUsername(currentUser.getUsername());
        ServerResponse<User> response = iUserService.updateInformation(user);
        if(response.isSuccess()){
            response.getData().setUsername(currentUser.getUsername());
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value = "get_information.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> get_information(HttpSession session){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"未登录,需要强制登录status=10");
        }
        return iUserService.getInformation(currentUser.getId());
    }






























}
