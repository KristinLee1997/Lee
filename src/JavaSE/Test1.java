package JavaSE;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/26 15:28
 * @desc    Java中isAssignableFrom()用法
 **/
class A {
}

class B extends A {
}

public class Test1 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        A ba = new B();
        System.out.println("1-------------");
        System.out.println(A.class.isAssignableFrom(a.getClass()));     //ture
        System.out.println(B.class.isAssignableFrom(b.getClass()));     //ture
        System.out.println(A.class.isAssignableFrom(b.getClass()));     //ture
        System.out.println(B.class.isAssignableFrom(a.getClass()));     //false
        System.out.println(A.class.isAssignableFrom(ba.getClass()));    //ture
        System.out.println(B.class.isAssignableFrom(ba.getClass()));    //ture
        System.out.println("2-------------");
        System.out.println(a.getClass().isAssignableFrom(A.class));     //ture
        System.out.println(b.getClass().isAssignableFrom(B.class));     //ture
        System.out.println(a.getClass().isAssignableFrom(B.class));     //ture
        System.out.println(b.getClass().isAssignableFrom(A.class));     //false
        System.out.println(ba.getClass().isAssignableFrom(A.class));    //false
        System.out.println(ba.getClass().isAssignableFrom(B.class));     //ture
        System.out.println("3-------------");
        System.out.println(Object.class.isAssignableFrom(b.getClass()));    //ture
        System.out.println(Object.class.isAssignableFrom("abc".getClass()));   //ture
        System.out.println("4-------------");
        System.out.println("a".getClass().isAssignableFrom(Object.class));    //false
        System.out.println("abc".getClass().isAssignableFrom(Object.class));    //false
    }
}
