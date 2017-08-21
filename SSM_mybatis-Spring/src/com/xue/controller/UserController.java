package com.xue.controller;

import com.xue.po.Student;
import com.xue.po.User;
import com.xue.service.StudentService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController{
    @Autowired
    private StudentService studentService;

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

    @RequestMapping("/uploadTest")
    public String uploadTest(){
        return "upload";
    }
    @RequestMapping("/upload")
    public String  upload (MultipartFile file, HttpServletRequest request) throws IOException {
        String name=file.getOriginalFilename();
        //文件保存的路径
        File uploadF=new File("/"+name);
        file.transferTo(uploadF);

        System.out.println(uploadF);
        return "user";
    }

    /*下载*/
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download() throws IOException {
        String path="D:\\1.png";
        File file=new File(path);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentDispositionFormData("attzchment",path);
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
    @RequestMapping("/stutest")
    public String stutest(@RequestBody Student student){
        studentService.creatStudent(student);
        return "user";
    }
    @RequestMapping("/delstutest")
    public String stutest(int id){
        studentService.delectStudent(id);
        return "user";
    }



}
