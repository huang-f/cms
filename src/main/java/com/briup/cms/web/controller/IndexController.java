package com.briup.cms.web.controller;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.ex.CategoryEX;
import com.briup.cms.service.Impl.CategoryServiceImpl;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
@Api(description = "首页展示")
public class IndexController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/findAll")
    @ApiOperation("首页展示")
    public Message<List<CategoryEX>> findAll() {
        return MessageUtil.success(categoryService.findAllCategoryEX());
    }

}
