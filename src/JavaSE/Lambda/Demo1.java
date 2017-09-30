package JavaSE.Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    @Test
    public void test() {
        A a = (int x, int y) -> System.out.println(x + y);  //带参数Lambda表达式
        a.ok(1, 3);

        B b = () -> {       //不带参数Lambda表达式
            System.out.println("we are secceed!");
            System.out.println("666");
        };
        b.ok();

        C c = () -> {       //带返回值Lambda表达式
            return 100;
        };
        System.out.println(c.ok());
    }

    @Test
    public void test2() {
        String[] lihang = new String[]{"Sha", "Ben", "Chou"};
        List<String> list = Arrays.asList(lihang);
        //遍历数组的两种方法
        list.forEach((i) -> System.out.println(i));
        list.forEach(System.out::println);
    }
}

interface A {
    public void ok(int a, int b);
}

interface B {
    public void ok();
}

interface C {
    public int ok();
}