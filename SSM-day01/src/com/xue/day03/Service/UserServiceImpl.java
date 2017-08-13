package com.xue.day03.Service;

import org.springframework.stereotype.Service;

/**
 * Created by Mr.xue on 2017/8/13.
 */

@Service//让application-context组件扫描能扫描到
public class UserServiceImpl implements UserService{
    @Override
    public String say(String value) {
        System.out.println(value);

        return "返回值";
    }
}
