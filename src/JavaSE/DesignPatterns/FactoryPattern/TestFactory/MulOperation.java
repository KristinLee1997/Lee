package JavaSE.DesignPatterns.FactoryPattern.TestFactory;

/**
 * Created by Administrator on 2017/6/11.
 */
public class MulOperation extends Operation {

    @Override
    public double getResult() {
        return Double.parseDouble(this.getNum1()) * Double.parseDouble(this.getNum2());
    }
}
