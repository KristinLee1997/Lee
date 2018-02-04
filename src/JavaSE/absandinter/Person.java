package JavaSE.absandinter;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/31 8:53
 * @desc
 **/
public abstract class Person {
    private String name;
    private int age;
    public static final int count = 9;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void say();

    public void talk() {
        System.out.println("this is talk");
    }
}
