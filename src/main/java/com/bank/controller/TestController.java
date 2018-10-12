package com.bank.controller;

import com.bank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        System.out.println("get request");
        testService.test();
        return "success";
    }
}
