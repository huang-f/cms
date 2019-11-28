package com.briup.cms.service.Impl;

import com.briup.cms.bean.Article;
import com.briup.cms.dao.IArticleDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.IArticleService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;
    @Override
    public void addOrUpdateArticle(Article article) throws CustomerException {
        if(article == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        article.setPublishDate(new Date());
        article.setClickTimes(0);
        articleDao.save(article);
    }

    @Override
    public Article queryById(int id) throws CustomerException {
        return articleDao.queryById(id);
    }

    @Override
    public List<Article> fingAll() throws CustomerException {
        return articleDao.findAll();
    }

    @Override
    public void deleteById(int id) throws CustomerException {
        articleDao.deleteById(id);
    }
}
