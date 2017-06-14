package JavaSE.DesignPatterns.FactoryPatterns.AbstractFactory;

/**
 * Created by Administrator on 2017/6/10.
 */
public class NorthFactory implements Factory {

    @Override
    public Apple getApple() {
        return new NorthApple();
    }

    @Override
    public Banana getBanana() {
        return new NorthBanana();
    }
}
