package JavaSE.DesignPatterns.FactoryPattern.AbstractFactory;

/**
 * Created by Administrator on 2017/6/10.
 */
public class SouthFactory implements Factory {
    public Apple getApple(){
        return new SouthApple();
    }

    public Banana getBanana(){
        return new SouthBanana();
    }
}
