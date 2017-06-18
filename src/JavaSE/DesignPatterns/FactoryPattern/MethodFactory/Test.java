package JavaSE.DesignPatterns.FactoryPattern.MethodFactory;

/**
 * Created by Administrator on 2017/6/10.
 * ---------------工厂方法模式---------------
 *简单工厂模式与工厂方法模式：
 * 工厂方法类的核心是一个抽象工厂类，简单工厂模式的核心是一个具体类
 * 当添加一个新对象时，简单工厂需要改动核心工厂类，而工厂方法只需要添加一个具体类
 */
public class Test {
    public static void main(String[] args) {
        Factory apple=new AppleFactory();
        Factory banana=new BananaFactory();
        apple.getFruit().get();
        banana.getFruit().get();
    }
}
