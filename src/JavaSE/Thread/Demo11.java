package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Demo11 {
    public static void main(String[] args) {
        Resource11 r = new Resource11();
        Input in1 = new Input(r);
        Output ou = new Output(r);
        Thread th1 = new Thread(in1);
        Thread th2 = new Thread(ou);
        th1.start();
        th2.start();
    }
}

class Resource11 {
    String name;
    String sex;
    boolean flag=false;
}

class Input implements Runnable {
    int x = 0;
    private Resource11 r;

    public Input(Resource11 r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            synchronized (r) {
                if(r.flag)
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                if (x == 0) {
                    r.name = "½ðÁú";
                    r.sex = "ÄÐ";
                } else {
                    r.name = "Àîº½";
                    r.sex = "Å®";
                }
                x = (x + 1) % 2;
                r.flag=true;
                r.notify();
            }
        }
    }
}

class Output implements Runnable {
    private Resource11 r;

    public Output(Resource11 r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            synchronized (r) {
                if(!r.flag)
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                System.out.println(r.name + "--------" + r.sex);
                r.flag=false;
                r.notify();
            }
        }
    }
}
