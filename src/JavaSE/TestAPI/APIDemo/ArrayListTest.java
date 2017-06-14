package JavaSE.TestAPI.APIDemo;

import java.util.*;

/**
 * Created by Administrator on 2017/5/24.
 * -----使用ArrayList，使容器内无重复元素------
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(1);
        list.add(new Student("lisi", 21));
        list.add(new Student("wangwu", 19));
        list.add(new Student("wangwu", 22));
        list.add(new Student("lisi", 22));

        getElement(list);
        System.out.println(list);
    }

    public static void getElement(List list) {
        List temp = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!temp.contains(o)) {    //contains()自动调用equals()方法， 所以需重写equals()方法
                temp.add(o);
            }
        }
        list.clear();
        list.addAll(temp);
    }


}

class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (!(obj instanceof Student)) {
//            throw new ClassCastException();
//        }
//        Student stu = (Student) obj;
//        return this.getName().equals(stu.getName());
}
