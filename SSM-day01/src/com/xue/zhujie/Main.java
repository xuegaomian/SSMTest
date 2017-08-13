package com.xue.zhujie;

import java.lang.reflect.Method;

/**
 * Created by Mr.xue on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,NullPointerException {
       Class clazz = Class.forName("com.xue.zhujie.Student");
        Method method = clazz.getDeclaredMethod("add",int.class,int.class);
        test t = method.getAnnotation(test.class);
        System.out.println(t.value());
        System.out.println(t.desc());

    }
}
