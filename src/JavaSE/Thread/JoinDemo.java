package JavaSE.Thread;

/**
 * Created by Administrator on 2017/6/3.
 * -----------JoinTest-------------
 */
public class JoinDemo extends Thread {
    private String name;

    public JoinDemo(String name) {
        super(name);
        //this.name=name;
    }

    public static void main(String[] args) {
        new JoinDemo("A").start();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                JoinDemo jd = new JoinDemo("±»joinµ÷ÓÃ");
                jd.start();
                try {
                    jd.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }
}
