package JavaSE.Reflect;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 15:21
 * @desc
 **/
public class ClassDemo4 {
    public static void main(String[] args) {
        Class c1 = int.class;  //int的类类型
        System.out.println(c1);
        Class c2 = String.class; //String的类类型

        Class c3 = double.class;
        Class c4 = Double.class;
        System.out.println(c3 == c4);

        Class c5 = void.class;
        System.out.println(c5);

        Class c6 = C1.class;
        System.out.println(c6.getName());
        System.out.println(c6.getSimpleName());
    }
}
