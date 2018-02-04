package JavaSE.Reflect;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 15:02
 * @desc
 **/
public class ClassDemo2 {
    public static void main(String[] args) {
        /*
         * 此时运行会报错,找不到C1类,C1的start(),C2类,C2的start()
         * 但是如果我们只想调用C1的方法,添加了C1类及其方法,程序仍然会报错,因为还是找不到C2及它的方法
         * 所以,new创建对象是静态加载类,在编译时刻就需要加载所有的可能使用到的类
         * 通过动态加载类可以解决该问题
         * */
        if ("C1".equals(args[0])) {
            C1 c1 = new C1();
            c1.start();
        }
        if ("C2".equals(args[0])) {
            C2 c2 = new C2();
            c2.start();
        }
    }
}
