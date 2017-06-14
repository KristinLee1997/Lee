package JavaSE.Thread;

/**
 * Created by Administrator on 2017/5/30.
 * ------创建线程方法一----------
 */
public class Demo1 {
    public static void main(String[] args) {
        Person p1 = new Person("lisi");
        Person p2 = new Person("wangwu");
        p2.start();
        p1.run();
    }
}

class Person extends Thread {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(name + " = " + Thread.currentThread().getName() + "  " + i);
        }
    }
}

