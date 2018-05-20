package com.bling.service;

import com.bling.common.ServerResponse;
import com.bling.pojo.Staff;
import com.bling.pojo.User;

public interface IStaffUserService {

    ServerResponse<Staff> login(String username, String password);

    ServerResponse<String> checkUsername(String str);

    public ServerResponse<String> addStaff(Staff staff);
}
