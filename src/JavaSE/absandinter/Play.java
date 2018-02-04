package JavaSE.absandinter;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/31 8:55
 * @desc
 **/
public interface Play {
    int age = 0;
    void swim();

    default void run() {
        System.out.println("run run");
    }

    static void ss(){
        System.out.println("hihihi");
    }
}


