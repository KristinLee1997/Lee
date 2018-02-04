package JavaSE.Reflect;


import java.lang.reflect.Method;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 17:35
 * @desc
 **/
public class MethodDemo1 {
    public static void main(String[] args) {
        //获取print(int,int)方法
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 获取方法,名称和参数列表
         * getMethod获取的是public方法
         * getDelcaredMethod获取自己声明的方法
         */
        try {
//            Method m=c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print", int.class, int.class);
//            a1.print(10,20);方法的反射操作是用m对象来进行方法调用
//            方法如果没有返回值返回null,有返回值返回具体的返回值

            Object o = m.invoke(a1, new Object[]{10, 20});
            System.out.println("======================");
            Method m1 = c.getMethod("print", String.class, String.class);
            o = m1.invoke(a1, "hello", "world");

            Method m2 = c.getMethod("print");
            m2.invoke(a1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class A {
    public void print() {
        System.out.println("hello world");
    }

    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "," + b.toUpperCase());
    }
}