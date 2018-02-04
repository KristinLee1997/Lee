package JavaSE.Train;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/23 14:35
 * @desc
 **/
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public boolean equals(Object obj) {
        if (this == obj) return true; //自反性
        /*这里不使用instanceOf,防止子类继承时出现问题,
        如Girl g1 = new Girl("a",11); 和 Person p1 = new Person("a",11);
        g1.equals(p1); //return true;
        */
        if (obj == null || this.getClass() != obj.getClass()) {  //传递性,非空性
            return false;
        }
        Person person = (Person) obj;
        return this.getName().equals(((Person) obj).getName()) &&
                this.getAge() == ((Person) obj).getAge();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }

    public static void main(String[] args) {
        Person p1 = new Person("a", 11);
        Person p2 = new Person("a", 12);
        Girl g1 = new Girl("a", 11);
        System.out.println(g1.equals(p1));
        Hashtable h = new Hashtable();
        HashMap hh = new HashMap();
        hh.put(null,"abc");
        hh.put(null,"abc2");
        hh.put("b","abc2");
        System.out.println(hh.get(null));

    }
}

class Girl extends Person {
    private String name;
    private int age;

    public Girl(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}