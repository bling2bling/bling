package com.bling.service.impl;

import com.bling.common.ServerResponse;
import com.bling.dao.CategoryMapper;
import com.bling.pojo.Category;
import com.bling.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by leinan
 */
@Service("iCategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public ServerResponse addCategory(Category category){
        int rowCount = categoryMapper.insertSelective(category);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("添加品类成功");
        }
        return ServerResponse.createByErrorMessage("添加品类失败");
    }
}
