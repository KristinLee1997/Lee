package JavaSE.DesignPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2017/6/15.
 * -------------装饰者模式---------------
 * 抽象组件角色：一个抽象接口，是被装饰类和装饰类的父接口
 * 具体组件角色：为抽象组件的实现类
 * 抽象装饰角色：包含一个组件的引用，并定义了与抽象组件一致的接口
 * 具体装饰角色：为抽象装饰角色的实现类，负责具体的装饰
 */
public class Test {
    public static void main(String[] args) {
        Car car = new RunCar();
        //car.show();
        Car swimCar = new SwimCarDecorator(car);
        //swimCar.show();
        Car flySwimCar = new FlyCarDecorator(swimCar);
        flySwimCar.show();
    }
}
