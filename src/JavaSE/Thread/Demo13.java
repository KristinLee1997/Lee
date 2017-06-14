package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/13.
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo13 {
    public static void main(String[] args) {
        Resource13 r = new Resource13();
        Input3 in = new Input3(r);
        Output3 ou = new Output3(r);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(ou);
        t1.start();
        t2.start();
    }
}

class Resource13 {
    private String name;
    private String sex;
    private boolean flag = false;
    private final Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    public void set(String name, String sex) {
        try {
            lock.lock();
            if (flag)
                try {
                    con.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            this.name = name;
            this.sex = sex;
            flag = true;
            con.signal();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            if (!flag)
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(this.name + "------" + this.sex);
            flag = false;
            con.signal();
        } finally {
            lock.unlock();
        }
    }
}

class Input3 implements Runnable {
    private Resource13 r;
    int x = 0;

    public Input3(Resource13 r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            if (x == 0) {
                r.set("½ðÁú", "boy");
            } else {
                r.set("Àîº½", "girl");
            }
            x = (x + 1) % 2;
        }
    }
}

class Output3 implements Runnable {
    private Resource13 r;

    public Output3(Resource13 r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.get();
        }
    }
}