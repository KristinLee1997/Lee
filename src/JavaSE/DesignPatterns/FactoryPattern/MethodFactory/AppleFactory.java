package JavaSE.DesignPatterns.FactoryPattern.MethodFactory;

/**
 * Created by Administrator on 2017/6/10.
 */
public class AppleFactory implements Factory {
    public Fruit getFruit() {
        return new Apple();
    }
}
