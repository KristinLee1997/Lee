package Train;

/**
 * Created by Administrator on 2017/5/9.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Person p = new Person("haha", 20);
        System.out.println(p);//println()自动调用toString()
    }
}

class Person {
    private int age;
    private String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + name + ",age" + age + "]";
    }
}
