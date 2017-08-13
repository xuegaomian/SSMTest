package Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
* 代理一个了类，将其拦截进行处理，完成aop
* */
public class UserInvocationHandl implements InvocationHandler{

    private Object target;//要代理的目标

    public UserInvocationHandl(){};

    public UserInvocationHandl(Object target) {
        this.target = target;
    }

    //要代理的类，方法以及参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前---"+method.getName());
        Object obj = method.invoke(target, args);
        System.out.println("调用后---"+method.getName());
        return obj;
    }
}
