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
        //��ÿ����������䶼��5
        Consumer<Person> con = (p) -> System.out.println(p.getName());
        con.accept(new Person("four", 4, "girl"));
        list.forEach((p) -> System.out.println(p.getAge() + 5));

        //�жϸö����Ƿ��ǿ�
        Predicate p = Objects::nonNull;
        System.out.println(p.test(new String("123")));

        //�жϸö����Ƿ�Ϊ��
        Predicate<String> p2 = String::isEmpty;
        System.out.println(p2.test("123"));

    }

    @Test
    public void test2() {
        //��ȡ�������������Ķ���
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
        //��������˵������
        Comparator<Person> com = (Person p5, Person p6) -> p5.getAge() - p6.getAge();
        System.out.println(com.compare(new Person("aaa", 19, "girl"), new Person("bbb", 9, "boy")));
        System.out.println(com.reversed().compare(new Person("aaa", 19, "girl"), new Person("bbb", 9, "boy")));

        //�оٳ�������С��������
        list.stream()
                .sorted((p7, p8) -> p7.getAge() - p8.getAge())
                .limit(2)
                .collect(Collectors.toList())
                .forEach((pp) -> System.out.println(pp.getName()));

    }

    @Test
    public void test4() {
        //�оٳ�����������
        System.out.println(list.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .max((s1, s2) -> s1.getAge() - s2.getAge())
                .get()
                .getName());

        //�оٳ�������С����
        System.out.println(list.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .min((s1, s2) -> s1.getAge() - s2.getAge())
                .get()
                .getName());
    }

    @Test
    public void test5() {
        //��String��ΪInteger
        Function<String, Integer> fun = Integer::valueOf;
        //��Integer��ΪString
        Function<String, String> fun1 = fun.andThen(String::valueOf);
        System.out.println(fun.apply("123".trim()));
    }

    @Test
    public void test6() {
        //���������
        System.out.println(list.stream()
                .map((p) -> p.getName())
                .collect(Collectors.joining("-------")));
        //���:one-------two-------three-------five
    }

    @Test
    public void test7() {
        //���������
        Set<String> set = list.stream()
                .map((p) -> p.getName())
                .collect(Collectors.toSet());
        set.forEach((p) -> System.out.println(p));
    }

    @Test
    public void test8(){
        //���������
        TreeSet s=list.stream()
                .map((p)->p.getName())
                .collect(Collectors.toCollection(TreeSet::new));
        s.forEach((p)-> System.out.println(p));
    }
}
