package JavaSE.Thread;

/**
 * Created by Administrator on 2017/5/30.
 * -----------为线程加同步锁--------------
 */
public class Demo3 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);
        Thread thread4 = new Thread(t);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}


class Ticket implements Runnable {
    Object obj = new Object();
    private int tickets = 100;

    public void run() {
        sale();
    }

    public void sale() {
        while (true) {
            synchronized (obj) {  //同步锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName() + " " + tickets--);
                }
            }
        }
    }

}