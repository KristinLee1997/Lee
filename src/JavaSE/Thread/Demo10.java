package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 * ------------继续Demo9的问题-------------
 * 生产者生产了产品后应告诉消费者来消费，此时生产者应等待
 * 消费者消费了产品后应告诉生产者来生产，此时消费者应等待
 * 注意：notify，notifyAll，wait必须使用在同步中，因为因为notify只能唤醒其所在锁wait的线程
 */
public class Demo10 {
    public static void main(String[] args) {
        Resource2 r = new Resource2();
        Producer2 p = new Producer2(r);
        Consumer3 c = new Consumer3(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Resource2 {
    private String name;
    private int count = 1;
    private boolean flag = false;//解决方案--加判断标识符

    public synchronized void set(String name) {
        if (flag)   //若为多生产多消费模式，应将if改为while
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name + count;
        System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name);
        count++;
        flag = true;
        this.notify();    //应唤醒对方线程，用notifyAll
    }

    public synchronized void get() {
        if (!flag) try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "---消费者---" + this.name);
        flag = false;
        this.notify();
    }
}

class Producer2 implements Runnable {
    Resource2 r;

    public Producer2(Resource2 r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.set("bread");
        }
    }
}

class Consumer3 implements Runnable {
    Resource2 r;

    public Consumer3(Resource2 r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.get();
        }
    }
}
