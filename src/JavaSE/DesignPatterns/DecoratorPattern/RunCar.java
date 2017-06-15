package JavaSE.DesignPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("can run");
    }

    @Override
    public void show() {
        this.run();
    }
}
