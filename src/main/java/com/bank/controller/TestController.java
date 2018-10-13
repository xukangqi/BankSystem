package com.bank.controller;

import com.bank.pojo.User;
import com.bank.service.TestService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;

@Controller
@RequestMapping("/user")
public class TestController {

    //通过接口注入service
    @Autowired
    private TestService testService;

    //请求格式 /user/hello
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        System.out.println("get request");
        testService.test();
        return "success";
    }

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject hello(@PathVariable("id")int id){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        jsonObject.put("result","success");
        return  jsonObject;
    }

    //请求格式 /user/hello2/id=123&password=123
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject hello2(@RequestParam(value = "id")int id,@RequestParam(value = "password")String password){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        jsonObject.put("result","success");
        return  jsonObject;
    }

    //post请求格式 /user/hello3
    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject hello3(@RequestParam(value = "id")int id,@RequestParam(value = "password")String password){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        jsonObject.put("result","success");
        return  jsonObject;
    }

    //post请求 /user/hello4 前端发送一个User类，后端自动注入
    @RequestMapping(value = "/hello4",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject hello4(User user){
        JSONObject jsonObject=new JSONObject();
        //service层操作


        //返回结果
        jsonObject.put("result","success");
        return  jsonObject;
    }
}
