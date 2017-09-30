package JavaSE.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/29.
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        try {
            d.getClass3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getClass1() {
        Person p = new Person();
        Class c = p.getClass();
    }

    public void getClass2() {
        Class c = Person.class;
    }

    public void getClass3() {
        String classname = "JavaSE.Reflect.Person";
        Class c = null;
        Object obj = null;
        try {
            c = Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            obj = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
    }

    public void getConsturctorDemo() throws Exception {
        String classname = "JavaSE.Reflect.Person";
        Class c = Class.forName(classname);
        Constructor con = c.getConstructor(String.class, int.class);
        Object obj = con.newInstance("lisi", 21);
        System.out.println(obj);
    }

    public void getField() throws Exception {
        String classname = "JavaSE.Reflect.Person";
        Class c = Class.forName(classname);
        String field = "age";
        Field f = c.getDeclaredField(field);
        // System.out.println(field);
        Object obj = c.newInstance();
        f.setAccessible(true);
        f.set(obj, 30);
        System.out.println(f.get(obj));
    }

    public void getMethod() throws Exception {
        String classname = "JavaSE.Reflect.Person";
        Class c = Class.forName(classname);
        String methodName = "show";
        Method m = c.getMethod(methodName, String.class, int.class);
        Object obj = c.newInstance();
        m.invoke(obj, "wangcai", 20);
    }

    public void getStaticMethod() throws Exception {
        String classname = "JavaSE.Reflect.Person";
        Class c = Class.forName(classname);
        String methodName = "staticShow";
        Method method = c.getMethod(methodName, null);
        method.invoke(null, null);

    }


}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void staticShow() {
        System.out.println("static show run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(String name, int age) {
        System.out.println("show run" + "name=" + name + "age=" + age);
    }


}