package com.xue.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Mr.xue on 2017/8/10.
 */
//描述自定义注解的注解叫元注解
@Target(ElementType.METHOD)//表示注解是加在属性上还是方法上
@Retention(RetentionPolicy.RUNTIME)//表示注解是一直到运行时都有用
public @interface test {
    public String value();
    public String desc()default "这是描述";
}
