package JavaSE.TestAPI.Lee;

import java.util.*;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Test {
    public static void main(String[] args) {
        /*
         *  泛型的限定在api中的使用。下限的体现。
		 *  TreeSet(Comparator<? super E> comparator)
		 *
		 *
		 */
        //创建一个集合存储的是学生对象。想要按照姓名排序。
        TreeSet<Student> ts = new TreeSet<Student>(new ComparatorByName());
        ts.add(new Student("abc", 26));
        ts.add(new Student("aaa", 29));
        ts.add(new Student("lisi", 20));


        for (Iterator<Student> it = ts.iterator(); it.hasNext(); ) {
            Student student = it.next();
            System.out.println(student);

        }

        //让工人按照姓名排序。
        TreeSet<Worker> ts2 = new TreeSet<Worker>(new ComparatorByName());
        ts2.add(new Worker("abc", 26));
        ts2.add(new Worker("aaa", 29));
        ts2.add(new Worker("lisi", 20));


        for (Iterator<Worker> it = ts2.iterator(); it.hasNext(); ) {
            Worker worker = it.next();
            System.out.println(worker);

        }
    }
}


class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int temp = o1.getName().compareTo(o2.getName());

        return temp == 0 ? o1.getAge() - o2.getAge() : temp;
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
}

class Worker extends Person {
    private String name;
    private int age;

    public Worker() {

    }

    public Worker(String name, int age) {
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
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        return name != null ? name.equals(worker.name) : worker.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

