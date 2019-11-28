package com.briup.cms.web.controller;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.handler.MessageContext;
import java.util.List;

@RestController
@RequestMapping("/article")
@Api(description = "信息管理")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @PostMapping("/add")
    @ApiOperation(value = "添加信息",notes = "category.name category.code 不写")
    public Message addArticle(Article article) {
        articleService.addOrUpdateArticle(article);
        return MessageUtil.success();
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有信息")
    public Message<List<Article>> findAll() {
        return MessageUtil.success(articleService.fingAll());
    }

    @GetMapping("/queryById")
    @ApiOperation("通过id查询")
    @ApiImplicitParam(name = "id",value = "信息id",dataType = "int",paramType = "query",required = true)
    public Message<Article> queryById(int id) {
        return MessageUtil.success(articleService.queryById(id));
    }

    @GetMapping("/delete")
    @ApiOperation("删除信息")
    @ApiImplicitParam(name = "id",value = "信息id",dataType = "int",paramType = "query",required = true)
    public Message deleteById(int id) {
        articleService.deleteById(id);
        return MessageUtil.success();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新信息",notes = "category.name category.code 不写")
    public Message update(Article article) {
        articleService.addOrUpdateArticle(article);
        return MessageUtil.success();
    }


}
