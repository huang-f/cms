package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;


public interface ILinkService  {

//    void addLink(Link link) throws CustomerException;

    void saveAddOrUpdateLink(Link link) throws CustomerException;

    void deleteById(int id) throws CustomerException;

    Link queryById(int id) throws CustomerException;

 //   void update(Link link) throws CustomerException;

    List<Link> findAllLink() throws CustomerException;
}
