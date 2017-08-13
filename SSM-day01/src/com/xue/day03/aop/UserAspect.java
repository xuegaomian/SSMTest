package com.xue.day03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Mr.xue on 2017/8/13.
 */
@Component  //为了让spring能扫描到
@Aspect  //声明切面
public class UserAspect {
        @Pointcut(value = "execution(* com.xue.day03.Service.*.*(..))")//拦截Service包所有service的所有方法，固定形式
        public void pointCut(){

        }

        //advice  干什么事，什么时候干
        @Before(value = "pointCut()")
        public void doBefore(JoinPoint joinPoint){//连接点  程序执行的点，多指的是程序的方法
            String name = joinPoint.getSignature().getName();
                Object[] arg = joinPoint.getArgs();
                System.out.println(name+"  "+arg.toString());

        }


        @After(value = "pointCut()")
        public  void  doAfter(JoinPoint joinPoint){
                String name = joinPoint.getSignature().getName();
                System.out.println(name);
        }
        @AfterReturning(value = "pointCut()",   returning = "result")
        //可以拿到切入点方法的返回值
        public void afterReturning(JoinPoint joinPoint,Object result){
            System.out.println(result);
        }
}
