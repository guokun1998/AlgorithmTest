package pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star realStar = null;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //代理执行任意方法都会来这里，可以根据name来让对象执行真正需要的方法，
        // 其他事情（做前，做后）都可以在这里进行。
        System.out.println("执行关键方法前");
        System.out.println("经纪人准备");

        if (method.getName().equals("sing")){
            method.invoke(realStar,args);
        }

        System.out.println("执行关键方法后");
        System.out.println("经纪人收钱");


        return null;
    }
}
