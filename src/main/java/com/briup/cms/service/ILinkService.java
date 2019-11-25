package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;
import org.springframework.stereotype.Service;


public interface ILinkService  {

    void addLink(Link link) throws CustomerException;
}
