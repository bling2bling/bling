package com.bling.service.impl;

import com.bling.dao.CategoryMapper;
import com.bling.pojo.Category;
import com.bling.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("iCategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public ArrayList getCategoryList() {
        return categoryMapper.selectAllCategory();
    }

    public int addCategory(Category category){
        return categoryMapper.insert(category);
    }
}
