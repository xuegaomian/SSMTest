import Invocation.UserInvocationHandl;
import service.UserService;
import service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Mian {
    public static void main(String[] args) {

        //JDK动态代理
        UserService userService= new UserServiceImpl();
        InvocationHandler invocationHandler=new UserInvocationHandl(userService);//让代理类去代理userService
        //得到代理对象userServiceProxy
        UserService userServiceProxy= (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),invocationHandler);
        userServiceProxy.callName("laowang");
    }
}
