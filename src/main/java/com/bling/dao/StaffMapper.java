package com.bling.dao;

import com.bling.pojo.Staff;
import com.bling.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int insert(Staff record);

    int insertSelective(Staff record);

    int checkUsername(@Param("username")String username);

    Staff selectLogin(@Param("username") String username, @Param("password")String password);
}