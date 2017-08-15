package cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
//实现了一个方法拦截器的接口
public class CglibProxy implements MethodInterceptor{
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前--"+method.getName());
        //传入要代理的对象和参数
        Object obj=methodProxy.invokeSuper(o,args);
        System.out.println("执行后--"+method.getName());
        return obj;
    }
}
