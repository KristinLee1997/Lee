package JavaSE.absandinter;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/31 8:58
 * @desc
 **/
public class Test implements Play {

    @Override
    public void swim() {
        System.out.println("i am swim");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.swim();
        t.run();

        Play.ss();
    }
}