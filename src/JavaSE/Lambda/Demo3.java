package JavaSE.Lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo3 {
    List<Person> list = new ArrayList<Person>() {
        {
            add(new Person("one", 1, "girl"));
            add(new Person("two", 2, "boy"));
            add(new Person("three", 3, "girl"));
            add(new Person("five", 5, "girl"));
        }
    };

    @Test
    public void test1() {
        //将每个对象的年龄都加5
        Consumer<Person> con = (p) -> System.out.println(p.getName());
        con.accept(new Person("four", 4, "girl"));
        list.forEach((p) -> System.out.println(p.getAge() + 5));

        //判断该对象是否不是空
        Predicate p = Objects::nonNull;
        System.out.println(p.test(new String("123")));

        //判断该对象是否为空
        Predicate<String> p2 = String::isEmpty;
        System.out.println(p2.test("123"));

    }

    @Test
    public void test2() {
        //获取满足以下条件的对象
        Predicate<Person> p3 = (s) -> s.getAge() > 1;
        Predicate<Person> p4 = (s) -> s.getSex() == "girl";
        list.stream()
                .filter(p3)
                .filter(p4)
                .limit(2)
                .forEach((s) -> System.out.println(s.getName()));
    }

    @Test
    public void test3() {
        //输出两个人的年龄差
        Comparator<Person> com = (Person p5, Person p6) -> p5.getAge() - p6.getAge();
        System.out.println(com.compare(new Person("aaa", 19, "girl"), new Person("bbb", 9, "boy")));
        System.out.println(com.reversed().compare(new Person("aaa", 19, "girl"), new Person("bbb", 9, "boy")));

        //列举出年龄最小的两个人
        list.stream()
                .sorted((p7, p8) -> p7.getAge() - p8.getAge())
                .limit(2)
                .collect(Collectors.toList())
                .forEach((pp) -> System.out.println(pp.getName()));

    }

    @Test
    public void test4() {
        //列举出年龄最大的人
        System.out.println(list.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .max((s1, s2) -> s1.getAge() - s2.getAge())
                .get()
                .getName());

        //列举出年龄最小的人
        System.out.println(list.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .min((s1, s2) -> s1.getAge() - s2.getAge())
                .get()
                .getName());
    }

    @Test
    public void test5() {
        //将String变为Integer
        Function<String, Integer> fun = Integer::valueOf;
        //将Integer变为String
        Function<String, String> fun1 = fun.andThen(String::valueOf);
        System.out.println(fun.apply("123".trim()));
    }

    @Test
    public void test6() {
        //遍历结果集
        System.out.println(list.stream()
                .map((p) -> p.getName())
                .collect(Collectors.joining("-------")));
        //结果:one-------two-------three-------five
    }

    @Test
    public void test7() {
        //遍历结果集
        Set<String> set = list.stream()
                .map((p) -> p.getName())
                .collect(Collectors.toSet());
        set.forEach((p) -> System.out.println(p));
    }

    @Test
    public void test8(){
        //遍历结果集
        TreeSet s=list.stream()
                .map((p)->p.getName())
                .collect(Collectors.toCollection(TreeSet::new));
        s.forEach((p)-> System.out.println(p));
    }
}
