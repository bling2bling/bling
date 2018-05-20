package com.bling.service;

import com.bling.common.ServerResponse;
import com.bling.dao.CategoryMapper;
import com.bling.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ICategoryService {

    ServerResponse addCategory(Category category);
}
