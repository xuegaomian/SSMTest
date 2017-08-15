import net.sf.cglib.proxy.Enhancer;
import cglib.CglibProxy;
import cglib.UserServiceImpl;

public class Mian {
    public static void main(String[] args) {

        //JDK动态代理
        /*UserService userService= new UserServiceImpl();
        InvocationHandler invocationHandler=new UserInvocationHandl(userService);//让代理类去代理userService
        //得到代理对象userServiceProxy
        //内部通过反射instance该类，然后在handler中执行invoke方法，进行操作
        UserService userServiceProxy= (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),invocationHandler);
        userServiceProxy.callName("laowang");*/

        //cglib代理
        CglibProxy proxy=new CglibProxy();
        //cglib的关键---加强
        Enhancer enhancer=new Enhancer();
        //cglib是基于继承，设置超类（传入要代理的类）
        enhancer.setSuperclass(UserServiceImpl.class);
        //设置回调
        enhancer.setCallback(proxy);
        //用cglib创建要代理的对象
        UserServiceImpl userservice_cglib= (UserServiceImpl) enhancer.create();
        userservice_cglib.callName("laowang");


    }
}
