package com.xjtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daihangtao on 2017/10/12.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/login")
    public String testLogin(){
        return "login";
    }

    @RequestMapping(value = "/check" , method = RequestMethod.POST)
    @ResponseBody
    public boolean checkLogin(@RequestParam String username,
                              @RequestParam String password){
   /*     String username = request.getParameter("username");
        String password = request.getParameter("password");
*/
        if (username.equals("abc")&&password.equals("123"))
            return true;
        else
            return false;
    }

    @RequestMapping(value = "/indextest")
    public String index(){
        return "/index";
    }
}
