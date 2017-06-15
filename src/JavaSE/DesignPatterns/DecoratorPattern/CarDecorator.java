package JavaSE.DesignPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public abstract void show();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
