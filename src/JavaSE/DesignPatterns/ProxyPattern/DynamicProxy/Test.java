package JavaSE.DesignPatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Test {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyHandler myHandle = new MyHandler();
        myHandle.setRealSubject(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), myHandle);
        proxySubject.sellbook();
    }
}
