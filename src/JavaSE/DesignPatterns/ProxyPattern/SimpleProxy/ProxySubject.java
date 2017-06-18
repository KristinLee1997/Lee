package JavaSE.DesignPatterns.ProxyPattern.SimpleProxy;

/**
 * Created by Administrator on 2017/6/17.
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }


    @Override
    public void sellbook() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        sale();
        this.realSubject.sellbook();
        give();
    }

    public void sale() {
        System.out.println("on sale");
    }

    public void give() {
        System.out.println("give voucher!");
    }
}
