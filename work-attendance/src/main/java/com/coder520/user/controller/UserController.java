package com.coder520.user.controller;

import com.coder520.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/home")
    public String home(){

        return "home";
    }

    @RequestMapping("/userinfo")
    @ResponseBody
    public User getUser(HttpSession session){
        User user= (User) session.getAttribute("userinfo");
        return  user;
    }

    /*
     *@Author:XueGaoMian
     *@Date:2017/8/24 9:40
     *@MethordDescription:退出系统
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    /*
     *@Author:XueGaoMian
     *@Date:2017/8/24 9:48
     *@MethordDescription:进入打卡记录页面
     */
    @RequestMapping("/attend")
    public String attend(){
        return "attend";
    }

}
