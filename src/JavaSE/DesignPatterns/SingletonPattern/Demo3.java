package JavaSE.DesignPatterns.SingletonPattern;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Demo3 {
    private Demo3() {

    }

    public static class Inner {
        public static Demo3 demo3 = new Demo3();
    }

    public static Demo3 get() {
        return Inner.demo3;
    }

}
