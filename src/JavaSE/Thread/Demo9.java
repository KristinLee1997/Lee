package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 * -------消费者和生产者----------
 * 期望生产一个产品，只有消费完才会生产下一个产品
 * 存在问题：消费者会消费之前生产被覆盖的产品
 * 当盘子中有面包时，生产者就不生产了，没有面包时，生产者生产
 * 当盘子中没有面包时，消费者就不消费了，有面包时，消费者消费
 */
public class Demo9 {
    public static void main(String[] args) {
        Resource r = new Resource();
        Producer p = new Producer(r);
        Consumer2 c = new Consumer2(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Resource {
    private String name;
    private int count = 1;

    public synchronized void set(String name) {//解决方案--加同步锁
        this.name = name + count;
        System.out.println(Thread.currentThread().getName() + "---生产者---" + this.name);
        count++;
    }

    public synchronized void get() {
        System.out.println(Thread.currentThread().getName() + "---消费者---" + this.name);
    }
}

class Producer implements Runnable {
    Resource r;

    public Producer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.set("bread");
        }
    }
}

class Consumer2 implements Runnable {
    Resource r;

    public Consumer2(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.get();
        }
    }
}