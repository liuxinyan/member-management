package com.management.controller;

import com.management.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    private IUserService service;

    public IUserService getService() {
        return service;
    }

    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    @RequestMapping("/login")
    public String login(){

        return null;
    }

    @RequestMapping("/lmain")
    public String lmain(){

        return "";
    }
}
