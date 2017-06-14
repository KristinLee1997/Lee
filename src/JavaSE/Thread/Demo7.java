package JavaSE.Thread;

/**
 * Created by king on 2017/5/28.
 * 懒汉式单例模式在多线程下的同步问题
 */

public class Demo7 {
    public static void main(String[] args) {
        A a = new A();
        Thread th1 = new Thread(a);
        Thread th2 = new Thread(a);
        th1.start();
        th2.start();
    }
}

class Singleton {
    private static Singleton s = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (s == null) {
            synchronized (Singleton.class) {
                if (s == null) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}

class A implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + Singleton.getInstance());
        }
    }
}