package JavaSE.DesignPatterns.FactoryPatterns.TestFactory;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class Operation {
    private String num1;
    private String num2;

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
