package JavaSE.DesignPatterns.ProxyPattern.SimpleProxy;

/**
 * Created by Administrator on 2017/6/17.
 */
public class RealSubject implements Subject {
    @Override
    public void sellbook() {
        System.out.println("sell book");
    }
}
