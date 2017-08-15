package com.xue.controller;

import com.xue.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController{
    //String类型返回到页面
    @RequestMapping("/test/{id}/{name}")//    如/user/test请求会请求道该类的该方法  {表示get请求传入的参数}
    public String testUser(ModelMap modelMap, @PathVariable("id") int ids, @PathVariable String name){


        User user=new User();
        user.setId(28);
        user.setName("laoli");
        System.out.println(ids);
        System.out.println(name);
        modelMap.addAttribute("user",user);
        return "user";//返回到"user.jsp"
    }
    //ModelAndView类型返回页面
    /*@RequestMapping("/test")//    如/user/test请求会请求道该类的该方法
    public ModelAndView testUser(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user");
        User user=new User();
        user.setId(18);
        user.setName("laowang");
        modelAndView.addObject("user",user);//设置要转到的页面名称
        return modelAndView;//返回到"user.jsp"
    }*/



    //请求转发和重定向（以上就是转发）
    /*
    * 重定向：redirect
    * */
    //String类型返回到页面
    @RequestMapping("/test1")//    如/user/test请求会请求道该类的该方法
    public String testRedirect(ModelMap modelMap){
        User user=new User();
        user.setId(28);
        user.setName("laoli");
        modelMap.addAttribute("user",user);
        return "demo";//返回到"user.jsp"     重定向：redirect:
    }
    //post请求 方法用HTTPServletRequest 参数接收
    @RequestMapping("/demo")
    public String demo(HttpServletRequest request, User user){
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        System.out.println("id="+id+"name="+name);
        return "postDemo";
    }
    @RequestMapping("/testjson")
    /*@ResponseBody    //意思是返回体调用springMVC.xml中的mvc:message-converters来处理返回数据（转json）
    public User testjson(){
        User user=new User();
        user.setName("laowang");
        user.setId(18);
        return user;
    }*/
    public String testjson( User user){

        return "user";
    }





}
