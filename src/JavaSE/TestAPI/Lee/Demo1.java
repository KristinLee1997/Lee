package JavaSE.TestAPI.Lee;

import java.util.*;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Demo1 {
    public static void main(String[] args) {
        new Demo1().DelSame();
    }

    public void ListDemo() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("one", 1));
        list.add(new Student("two", 2));
        list.add(new Student("three", 3));
        list.add(new Student("four", 4));
        list.add(new Student("five", 5));


        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student stu = (Student) it.next();
            if (stu.getAge() == 3) {
                it.remove();
            }
            //System.out.println(stu);
        }

        list.set(3, new Student("haha", 11));
        for (Student i : list) {
            System.out.println(i);
        }
    }

    public void SetDemo() {
        Set<Student> set = new LinkedHashSet<Student>();

        set.add(new Student("one", 1));
        set.add(new Student("two", 2));
        set.add(new Student("three", 3));
        set.add(new Student("four", 4));
        set.add(new Student("five", 5));
        Iterator<Student> it = set.iterator();

        while (it.hasNext()) {
            Student o = it.next();
            System.out.println(o);
        }
    }

    public void DelSame() {
        Set<Student> set = new TreeSet<Student>(new ComparatorByAge());

        set.add(new Student("lisi", 2));
        set.add(new Student("wangwu", 1));
        set.add(new Student("three", 3));
        set.add(new Student("lisi", 4));
        set.add(new Student("wangwu", 2));


        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class ComparatorByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getAge() - o2.getAge();
        return temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
    }
}
