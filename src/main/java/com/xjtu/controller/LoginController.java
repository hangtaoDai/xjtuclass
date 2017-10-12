package com.xjtu.controller;

import com.xjtu.model.User;
import com.xjtu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Daihangtao on 2017/10/12.
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public boolean login(@RequestParam String username, @RequestParam String password,
                         HttpServletRequest request){
        User user = loginService.checkedLogin(username);
        if (user.getPassword().equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            return true;
        }
        else
            return false;
    }

}
