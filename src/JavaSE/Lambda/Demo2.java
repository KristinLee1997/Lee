package JavaSE.Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo2 {
    @Test
    public void test() {    //Thread的启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run!!!!");
            }
        }).start();

        new Thread(() -> System.out.println("run!!!!!!!!!!!!!")).start();//Lambda写法
    }

    @Test
    public void teset2() {   //Runnable的匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("test2");
            }
        };

        Runnable r2 = () -> System.out.println("test2222222");//Lambda写法

        r.run();
    }

    @Test
    public void test3() {
        String[] name = new String[]{"bianxingjingang", "chaoren", "gangtiexia", "wudihaoke", "zhizhuxia", "lvjuren"};
        Arrays.sort(name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    @Test
    /*----数组排序------*/
    public void test4() {
        String[] name = new String[]{"bianxingjingang", "chaoren", "gangtiexia", "wudihaoke", "zhizhuxia", "lvjuren"};

        //将数组排序方法一:
        Comparator<String> com = (String str1, String str2) -> (str1.compareTo(str2));
        Arrays.sort(name, com);

        //将数组排序方法二:
        Arrays.sort(name, (String s1, String s2) -> (s1.compareTo(s2)));

        //将数组排序方法三: 在长度不等时比较长度;长度相等时比较unicode
        Arrays.sort(name, (String str1, String str2) -> str1.length() == str2.length() ? str1.compareTo(str2) : str1.length() - str2.length());

        for (String n : name) {
            System.out.println(n);
        }
    }
}

