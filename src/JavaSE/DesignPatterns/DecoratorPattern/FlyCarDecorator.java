package JavaSE.DesignPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly() {
        System.out.println("can fly");
    }


}
