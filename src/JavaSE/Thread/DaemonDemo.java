package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/3.
 * -----------首户线程示例------------
 * 前台线程：程序员自定义的线程以及main()
 * 当某一线程设置为守护线程时，相当于将该线程设置为后台线程，用于守护前台线程，当前台线程死亡时，JVM会通知后台线程，
 * 一段时间内后台线程无论是否执行完都会死亡，程序结束。
 */
public class DaemonDemo extends Thread {
    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread("ReplacementMothod");

        d1.start();
        DaemonThread2 d2 = new DaemonThread2("B");
        d2.setDaemon(true);
        d2.start();
        for (int i = 0; i <= 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("main over------->");
    }
}

class DaemonThread extends Thread {
    private String name;

    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " " + i);
        }
        System.out.println("1-------over");
    }
}

class DaemonThread2 extends Thread {
    private String name;

    public DaemonThread2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 5000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "------" + i);
        }
        System.out.println("2--------over");
    }
}