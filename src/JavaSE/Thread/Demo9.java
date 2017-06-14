package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 * -------�����ߺ�������----------
 * ��������һ����Ʒ��ֻ��������Ż�������һ����Ʒ
 * �������⣺�����߻�����֮ǰ���������ǵĲ�Ʒ
 * �������������ʱ�������߾Ͳ������ˣ�û�����ʱ������������
 * ��������û�����ʱ�������߾Ͳ������ˣ������ʱ������������
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

    public synchronized void set(String name) {//�������--��ͬ����
        this.name = name + count;
        System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
        count++;
    }

    public synchronized void get() {
        System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
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