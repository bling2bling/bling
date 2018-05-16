package com.bling.dao;

import com.bling.pojo.Staff;

public interface StaffMapper {
    int insert(Staff record);

    int insertSelective(Staff record);
}