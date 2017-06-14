package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Demo12 {
    public static void main(String[] args) {
        Resource12 r = new Resource12();
        Input2 in = new Input2(r);
        Output2 ou = new Output2(r);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(ou);
        t1.start();
        t2.start();
    }
}

class Resource12 {
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex) {
        if (flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void get() {
        if (!flag)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(this.name + "------" + this.sex);
        flag = false;
        this.notify();
    }
}

class Input2 implements Runnable {
    private Resource12 r;
    int x = 0;

    public Input2(Resource12 r) {
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

class Output2 implements Runnable {
    private Resource12 r;

    public Output2(Resource12 r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.get();
        }
    }
}
