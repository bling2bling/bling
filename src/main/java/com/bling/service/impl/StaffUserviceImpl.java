package com.bling.service.impl;

import com.bling.common.Const;
import com.bling.common.ServerResponse;
import com.bling.dao.StaffMapper;
import com.bling.dao.UserMapper;
import com.bling.pojo.Staff;
import com.bling.pojo.User;
import com.bling.service.IStaffUserService;
import com.bling.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by leinan
 */
@Service("iStaffUserService")
public class StaffUserviceImpl implements IStaffUserService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public ServerResponse<Staff> login(String username, String password) {
        int resultCount = staffMapper.checkUsername(username);
        if(resultCount == 0 ){
            String msg="用户名不存在";
            return ServerResponse.createByErrorMessage(msg);
        }
        String md5Password=MD5Util.MD5EncodeUtf8(password);
        Staff staff  = staffMapper.selectLogin(username,md5Password);
        if(staff == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        staff.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",staff);
    }

    public ServerResponse<String> addStaff(Staff staff) {
        ServerResponse validResponse = this.checkUsername(staff.getUsername());
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        //MD5加密
        staff.setPassword(MD5Util.MD5EncodeUtf8(staff.getPassword()));
        int resultCount = staffMapper.insert(staff);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    public ServerResponse<String> checkUsername(String str){
        int resultCount = staffMapper.checkUsername(str);
        if(resultCount > 0 ){
            return ServerResponse.createByErrorMessage("用户名已存在");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }
}
