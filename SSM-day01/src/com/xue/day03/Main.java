package com.xue.day03;

import com.xue.day03.Service.UserService;
import com.xue.day03.controller.UserController;
import com.xue.day03.po.UserFather;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mr.xue on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
        /*ApplicationContext context=
                new ClassPathXmlApplicationContext("./com/xue/day03/resources/application-context.xml");
        User user= (User) context.getBean("user");*/

        /*复杂类型的注入*/
        ApplicationContext context1=
               new ClassPathXmlApplicationContext("./com/xue/day03/resources/application-context.xml");
        UserFather userFather = (UserFather) context1.getBean(UserFather.class);

        System.out.println(userFather);

        /*关于@Service注解*/
        UserController userController = (UserController) context1.getBean(UserController.class);
        UserService userService=userController.getUserService();
        userService.say("laowang");

    }
}
