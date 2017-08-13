package com.xue.day03.controller;


import com.xue.day03.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Mr.xue on 2017/8/13.
 */
@Controller
public class UserController {

    @Autowired   //相当于userService=new UserService();
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
