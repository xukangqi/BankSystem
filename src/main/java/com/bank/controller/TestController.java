package com.bank.controller;

import com.bank.pojo.BankUser;
import com.bank.service.TestService;
import com.bank.utils.BankResult;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    //通过接口注入service
    @Autowired
    private TestService testService;


    //请求格式 /user/hello
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public BankResult sayHello(){
        System.out.println("get request");
//        testService.test1();
        return BankResult.ok("你好");
    }

    //请求格式 /user/hello/1
    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult hello(@PathVariable("id")int id){
        JSONObject jsonObject=new JSONObject();
        //service层操作
//      BankUser bankUser=new BankUser();

        //返回结果
        return  BankResult.ok();
    }

    //请求格式 /user/hello2/id=123&password=123
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    @ResponseBody
    public BankResult hello2(@RequestParam(value = "id")int id,@RequestParam(value = "password")String password){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        BankResult bankResult=new BankResult();
        bankResult.setData(new BankUser());
        bankResult.setMsg("error");
        bankResult.setStatus(501);
        return  bankResult;
    }

    //post请求格式 /user/hello3
    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    @ResponseBody
    public BankResult hello3(@RequestParam(value = "id")int id,@RequestParam(value = "password")String password){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        return  BankResult.ok();
    }

    //post请求 /user/hello4 前端发送一个User类，后端自动注入
    @RequestMapping(value = "/hello4",method = RequestMethod.POST)
    @ResponseBody
    public BankResult hello4(BankUser user){
        JSONObject jsonObject=new JSONObject();
        //service层操作


       //返回结果
        return  BankResult.ok();
    }
}
