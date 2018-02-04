package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/4 0:19
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("wangwu", 13);
        Person p2 = new Person("wangwu", 12);
        System.out.println(p1.compareTo(p2));


        Student s1 = new Student("zisi", 15);
        Student s2 = new Student("wangu", 15);
        Student[] list = new Student[2];
        list[0] = s1;
        list[1] = s2;
        Arrays.sort(list, new CMP());
        System.out.println(Arrays.toString(list));
    }
}

class Person implements Comparable {
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
    public int compareTo(Object o) {
        Person p = (Person) o;
        if (this.age != p.getAge()) {
            return this.age > p.getAge() ? 1 : -1;
        }
        if (this.name.equals(p.getName())) {
            return 0;
        }
        return this.name.equals(p.getName()) ? 1 : -1;
    }
}

class Student implements Comparator {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public int compare(Object o1, Object o2) {
        Student a = (Student) o1;
        Student b = (Student) o2;
        if (a.getName().compareTo(b.getName()) != 0)
            return a.getName().compareTo(b.getName());
        else {
            if (a.getAge() < b.getAge())
                return -1;
            else if (a.getAge() > b.getAge())
                return 1;
            else return 0;
        }
    }
}

class CMP implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student a = (Student) o1;
        Student b = (Student) o2;
        if (a.getName().compareTo(b.getName()) != 0)
            return a.getName().compareTo(b.getName());
        else {
            if (a.getAge() < b.getAge())
                return -1;
            else if (a.getAge() > b.getAge())
                return 1;
            else return 0;
        }
    }
}