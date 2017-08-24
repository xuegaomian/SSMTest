package com.coder520.attend.controller;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/24 9:56
 *@Description:
 */

import com.coder520.attend.entity.Attend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("attend")
public class AttendController {
    /*
     *@Author:XueGaoMian
     *@Date:2017/8/24 9:56
     *@MethordDescription:跳转打卡记录页面
     */
    @RequestMapping()
    public String attend(){

        return "attend";
    }

    /*
     *@Author:XueGaoMian
     *@Date:2017/8/24 10:31
     *@MethordDescription:签到功能  log4j
     */
    @RequestMapping("/signAttend")
    public String signAttend(@RequestBody Attend attend){}

}
