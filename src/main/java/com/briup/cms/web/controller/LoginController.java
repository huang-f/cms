package com.briup.cms.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/authentication/form")
    public void login(String username,String password){

    }
}
