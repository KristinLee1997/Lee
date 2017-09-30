package JavaSE.Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo2 {
    @Test
    public void test() {    //Thread������
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run!!!!");
            }
        }).start();

        new Thread(() -> System.out.println("run!!!!!!!!!!!!!")).start();//Lambdaд��
    }

    @Test
    public void teset2() {   //Runnable�������ڲ���
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("test2");
            }
        };

        Runnable r2 = () -> System.out.println("test2222222");//Lambdaд��

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
    /*----��������------*/
    public void test4() {
        String[] name = new String[]{"bianxingjingang", "chaoren", "gangtiexia", "wudihaoke", "zhizhuxia", "lvjuren"};

        //���������򷽷�һ:
        Comparator<String> com = (String str1, String str2) -> (str1.compareTo(str2));
        Arrays.sort(name, com);

        //���������򷽷���:
        Arrays.sort(name, (String s1, String s2) -> (s1.compareTo(s2)));

        //���������򷽷���: �ڳ��Ȳ���ʱ�Ƚϳ���;�������ʱ�Ƚ�unicode
        Arrays.sort(name, (String str1, String str2) -> str1.length() == str2.length() ? str1.compareTo(str2) : str1.length() - str2.length());

        for (String n : name) {
            System.out.println(n);
        }
    }
}

