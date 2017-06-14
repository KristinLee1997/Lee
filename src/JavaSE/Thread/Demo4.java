package JavaSE.Thread;

/**
 * Created by Administrator on 2017/5/30.
 * -----------线程小例子之银行储蓄-----------------
 */
public class Demo4 {
    public static void main(String[] args) {
        Consumer c = new Consumer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Bank {
    private int sum;
    private Object obj = new Object();

    public void add(int num) {
        synchronized (obj) {
            sum += num;
            System.out.println("sum=" + sum);
        }
    }
}

class Consumer implements Runnable {
    private Bank b = new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
        }
    }
}