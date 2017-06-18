package JavaSE.DesignPatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/6/17.
 */
public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        sale();
        result = method.invoke(realSubject, args);
        give();
        return result;
    }

    public void sale() {
        System.out.println("on sale");
    }

    public void give() {
        System.out.println("goiv voucher!");
    }
}
