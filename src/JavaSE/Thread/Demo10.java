package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/2.
 * ------------����Demo9������-------------
 * �����������˲�Ʒ��Ӧ���������������ѣ���ʱ������Ӧ�ȴ�
 * �����������˲�Ʒ��Ӧ��������������������ʱ������Ӧ�ȴ�
 * ע�⣺notify��notifyAll��wait����ʹ����ͬ���У���Ϊ��Ϊnotifyֻ�ܻ�����������wait���߳�
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
    private boolean flag = false;//�������--���жϱ�ʶ��

    public synchronized void set(String name) {
        if (flag)   //��Ϊ������������ģʽ��Ӧ��if��Ϊwhile
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name + count;
        System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
        count++;
        flag = true;
        this.notify();    //Ӧ���ѶԷ��̣߳���notifyAll
    }

    public synchronized void get() {
        if (!flag) try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "---������---" + this.name);
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
