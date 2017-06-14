package JavaSE.Thread;

/**
 * Created by Administrator on 2017/5/30.
 */
public class Demo5 {
    public static void main(String[] args) {
        Ticket2 t = new Ticket2();
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


class Ticket2 implements Runnable {
    Object obj = new Object();
    private int tickets = 1000;

    public void run() {
        while (true) {
            scale();
        }
    }

    public synchronized void scale() {
        if (tickets > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " " + tickets--);
        }
    }
}
