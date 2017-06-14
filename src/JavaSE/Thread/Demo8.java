package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 * -------------DeadLock--------------
 */
public class Demo8 {
    public static void main(String[] args) {
        Test2 t1 = new Test2(true);
        Test2 t2 = new Test2(false);
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t3.start();
        t4.start();
    }
}

class Test2 implements Runnable {
    private boolean flag;

    public Test2(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (Lock.LOCKA) {
                System.out.println("if-----LockA------");
                synchronized (Lock.LOCKB) {
                    System.out.println("if------LockB-------");
                }
            }
        } else {
            synchronized (Lock.LOCKB) {
                System.out.println("else-----LockA");
                synchronized (Lock.LOCKA) {
                    System.out.println("else------LockB");
                }
            }
        }
    }
}

class Lock {
    public static final Object LOCKA = new Object();
    public static final Object LOCKB = new Object();
}
