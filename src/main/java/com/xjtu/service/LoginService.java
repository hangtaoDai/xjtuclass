package com.xjtu.service;

import com.xjtu.dao.UserMapper;
import com.xjtu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by lenovo on 2017/10/12.
 */
@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;

    public User checkedLogin(String username){

        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
        return user;
    }

}
