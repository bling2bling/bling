package com.bling.service;

import com.bling.pojo.Category;

import java.util.ArrayList;

public interface ICategoryService {
    ArrayList getCategoryList();

    int addCategory(Category category);
}

