package com.briup.cms.service;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface IArticleService {
    void addOrUpdateArticle(Article article) throws CustomerException;

    Article queryById(int id) throws CustomerException;

    List<Article> fingAll() throws CustomerException;

    void deleteById(int id) throws CustomerException;
}
