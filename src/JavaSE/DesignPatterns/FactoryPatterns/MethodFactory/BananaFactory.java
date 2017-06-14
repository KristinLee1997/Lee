package JavaSE.DesignPatterns.FactoryPatterns.MethodFactory;

/**
 * Created by Administrator on 2017/6/10.
 */
public class BananaFactory implements Factory {
    public Fruit getFruit() {
        return new Banana();
    }
}
