package com.lan.webfluxserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lan_yl on 2018/4/10.
 */
@RestController
@RequestMapping(value = "/webflux")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Welcome to reactive world !";
    }


}
