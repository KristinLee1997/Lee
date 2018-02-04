package JavaSE.Reflect;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 14:32
 * @desc
 **/
public class ClassDemo1 {
    public static void main(String[] args) {
        //创建Foo类的实例对象foo1
        Foo foo1 = new Foo();

        //任何一个类都是Class的实例对象,并且这些对象由JVM创建,这个实例对象有三种表示方式
        //第一种表示方式-->实际在告诉我们任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;

        //第二种表示方式-->已经知道该类的对象通过getClass方法获取
        Class c2 = foo1.getClass();

        /*官网表示:c1,c2表示了Foo类的类类型(class type)
         * 类类型:类也是对象,是Class的实例对象,这个对象就是该类的类类型
         * */
        //一个类只可能是Class的一个对象
        System.out.println(c1 == c2);

        //第三种表达方式-->通过Class,forName()
        Class c3 = null;
        try {
            c3 = Class.forName("JavaSE.Reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c2 == c3);
        /*
         * 可以通过类的类类型创建该类的对象实例-->通过c1,c2,c3创建Foo的实例对象
         * */
        try {
            //调用newInstance()时需要有无参数的构造方法
            Foo foo2 = (Foo) c1.newInstance();
            Foo foo3 = (Foo) c2.newInstance();
            Foo foo4 = (Foo) c3.newInstance();
            foo2.print();
            foo3.print();
            foo4.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo {
    void print() {
        System.out.println("I am method print in Foo");
    }
}