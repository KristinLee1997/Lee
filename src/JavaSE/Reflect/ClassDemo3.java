package JavaSE.Reflect;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 15:13
 * @desc
 **/
public class ClassDemo3 {
    public static void main(String[] args) {
        try {
            //动态加载类,在运行时加载类
            Class c = Class.forName(args[0]);
            //通过类类型,创建该类对象
            CAble cc = (CAble) c.newInstance();
            cc.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
