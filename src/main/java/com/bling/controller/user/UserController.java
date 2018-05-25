package com.bling.controller.user;

import com.bling.common.Const;
import com.bling.common.ResponseCode;
import com.bling.common.ServerResponse;
import com.bling.pojo.User;
import com.bling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(value = "login.do/{username}",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView login(@PathVariable(value = "username") String username, String password, HttpSession session) {
            ServerResponse<User> response = iUserService.login(username, password);
            if (response.isSuccess()) {
                session.setAttribute(Const.CURRENT_USER, response.getData());
                ModelAndView modelAndView=new ModelAndView("user/index");
                modelAndView.addObject("username",response.getMsg());
                return modelAndView;
            }
        ModelAndView modelAndView=new ModelAndView("user/login");
        if(response.getStatus()==3){
            modelAndView.addObject("nameError",response.getMsg());
        }
        if(response.getStatus()==4){
            modelAndView.addObject("pwdError",response.getMsg());
        }
        return modelAndView;
        }


    @RequestMapping(value = "logout.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView register(User user){
        System.out.println("username:"+user.getUsername()+"password:"+user.getPassword());
        Pattern name=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        Pattern password=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        Pattern email=Pattern.compile("^[\\w-]+@[\\w-]+(\\.[\\w-]+)+$");
        Pattern phone=Pattern.compile("^1((3[0-9])|(4[5|7])|(5([0-3]|[5-9]))|（70）|(8[0,5-9]))\\d{8}$");
        if(user.getEmail()==null||!email.matcher(user.getEmail()).matches()){
            ServerResponse response =ServerResponse.createByErrorCodeMessage(ResponseCode.EMAIL_ILLEGAL.getCode(),ResponseCode.EMAIL_ILLEGAL.getDesc());
            ModelAndView modelAndView=new ModelAndView("user/register");
            modelAndView.addObject("emailError",response.getMsg());
            return modelAndView;
        }
        if(user.getUsername()==null||!name.matcher(user.getUsername()).matches()){
            ServerResponse response = ServerResponse.createByErrorCodeMessage(ResponseCode.USERNAME_ILLEGAL.getCode(),ResponseCode.USERNAME_ILLEGAL.getDesc());
            ModelAndView modelAndView=new ModelAndView("user/register");
            modelAndView.addObject("nameError",response.getMsg());
            return modelAndView;
        }
        if(user.getPassword()==null||!password.matcher(user.getPassword()).matches()){
            ServerResponse response =ServerResponse.createByErrorCodeMessage(ResponseCode.PASSWORD_ILLEGAL.getCode(),ResponseCode.PASSWORD_ILLEGAL.getDesc());
            ModelAndView modelAndView=new ModelAndView("user/register");
            modelAndView.addObject("passwordError",response.getMsg());
            return modelAndView;
        }
        if(user.getMobilePhone()!=null){
            if(!phone.matcher(user.getMobilePhone()).matches()){
                ServerResponse response =ServerResponse.createByErrorCodeMessage(ResponseCode.PHONE_ILLEGAL.getCode(),ResponseCode.PHONE_ILLEGAL.getDesc());
                ModelAndView modelAndView=new ModelAndView("user/register");
                modelAndView.addObject("phoneError",response.getMsg());
                return modelAndView;
            }
        }
        ServerResponse<String> response=iUserService.register(user);
        if(response.getStatus()==0) {
            ModelAndView modelAndView = new ModelAndView("user/registerSuccess");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("user/register");
        modelAndView.addObject("passwordError",response.getMsg());
        return modelAndView;
    }

    @RequestMapping(value = "check_valid.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str,String type){
        ServerResponse<String> response = iUserService.checkValid(str,type);
        return response;
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
    public ModelAndView forgetGetQuestion(String username,HttpSession session){
        ServerResponse<String> response = iUserService.selectQuestion(username);
        int status=response.getStatus();
        if(status==0){
            ModelAndView modelAndView=new ModelAndView("user/forgetPwd2");
            modelAndView.addObject("question",response.getData());
            session.setAttribute("question",response.getData());
            session.setAttribute("username",username);
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("user/forgetPwd1");
        modelAndView.addObject("nameError",response.getMsg());
        return modelAndView;
    }


    @RequestMapping(value = "forget_check_answer.do",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView forgetCheckAnswer(String answer,HttpSession session){
        String question=(String)session.getAttribute("question");
        String username=(String)session.getAttribute("username");
        ServerResponse<String> response = iUserService.checkAnswer(username,question,answer);
        if(response.getStatus()==0){
            session.setAttribute("token",response.getData());
            ModelAndView modelAndView=new ModelAndView("user/f_resetPwd");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("user/forgetPwd2");
        modelAndView.addObject("answerError","答案错误，try again");
        return modelAndView;
    }


    @RequestMapping(value = "forget_reset_password.do",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView forgetRestPassword(String passwordNew,HttpSession session){
        String username=(String)session.getAttribute("username");
        String forgetToken=(String)session.getAttribute("token");
        Pattern password=Pattern.compile("^[A-Za-z1-9_]{6,10}$");
        if(passwordNew==null||!password.matcher(passwordNew).matches()){
            ModelAndView modelAndView=new ModelAndView("user/f_resetPwd");
            modelAndView.addObject("resetPwdError",ResponseCode.PASSWORD_ILLEGAL.getDesc());
            return modelAndView;
        }
        ServerResponse<String> response=iUserService.forgetResetPassword(username,passwordNew,forgetToken);
        if(response.getStatus()==0){
            ModelAndView modelAndView=new ModelAndView("user/resetPwdS");
            System.out.println("******");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("user/f_resetPwd");
        modelAndView.addObject("resetPwdError",response.getMsg());
        return modelAndView;
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
