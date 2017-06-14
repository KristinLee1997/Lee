package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/3.
 * -----------�׻��߳�ʾ��------------
 * ǰ̨�̣߳�����Ա�Զ�����߳��Լ�main()
 * ��ĳһ�߳�����Ϊ�ػ��߳�ʱ���൱�ڽ����߳�����Ϊ��̨�̣߳������ػ�ǰ̨�̣߳���ǰ̨�߳�����ʱ��JVM��֪ͨ��̨�̣߳�
 * һ��ʱ���ں�̨�߳������Ƿ�ִ���궼�����������������
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