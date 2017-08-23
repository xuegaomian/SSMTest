package com.coder520.login.controller;

import com.coder520.common.util.SecurityUtils;
import com.coder520.user.entity.User;
import com.coder520.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public String login(){
        return "login";
    }

    @ResponseBody//没有该注解就会默认找页面
    @RequestMapping("/check")
    public String checkLogin(HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
       /*
        *   查数据库，如果查到数据，MD5加密对比
        *   校验成功用户信息存session 进入首页
        *   如果失败，返回校验失败提示
        */
        User user= userService.findUserByUserName(username);
        if(user!=null){
            if (SecurityUtils.checkPasswprd(password,user.getPassword())){
                //设置session
                request.getSession().setAttribute("userinfo",user);
                return "login_succ";

            }else{
                return "login_error";
            }
        }else{
            return "login_error";
        }


    }

    /*
    * 注册用户
    * */
    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userService.creatUser(user);
        return "succ";
    }
}
