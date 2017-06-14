package JavaSE.DesignPatterns.FactoryPatterns.MethodFactory;

/**
 * Created by Administrator on 2017/6/10.
 */
public class AppleFactory implements Factory {
    public Fruit getFruit() {
        return new Apple();
    }
}
