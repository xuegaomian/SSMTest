package com.xue.day03.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Mr.xue on 2017/8/13.
 *
 * xml方式实现aop
 */
public class Logger {

    public void doLogger(ProceedingJoinPoint proceedingJoinPoint){
        try {
            //对方法操作之后，通过此步骤放过拦截的方法
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
