package com.briup.cms.service.Impl;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.ex.CategoryEX;
import com.briup.cms.dao.ICategoryDao;
import com.briup.cms.dao.ex.ICategoryEXDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Autowired
    private ICategoryEXDao categoryEXDao;

    @Override
    public void saveAddOrUpdateCategory(Category category) {
        if(category == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        categoryDao.save(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        categoryDao.deleteById(id);
    }

    @Override
    public Category queryCategoryById(int id) {
        return categoryDao.queryById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public List<CategoryEX> findAllCategoryEX() throws CustomerException {
        return categoryEXDao.findAll();
    }

}
