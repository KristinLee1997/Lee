package JavaSE.TestAPI.APIDemo;

import java.util.*;

/**
 * Created by Administrator on 2017/5/24.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student("lisi", 21));
        set.add(new Student("wangwu", 19));
        set.add(new Student("wangwu", 22));
        set.add(new Student("lisi", 22));

        System.out.println(set);
    }
}
