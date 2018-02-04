package JavaSE.Reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/4 18:23
 * @desc
 **/
public class MethodDemo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);  //true
        /**
         * c1==c2结果返回true说明编译之后集合的泛型是去泛型化的
         * Java中集合的泛型是防止错误输入的,只在编译阶段有效
         * 绕过编译就无效了
         */

        try {
            Method m = c1.getMethod("add", Object.class);
            m.invoke(list1, 100);//染过编译操作就绕过了泛型
            System.out.println(list1.size());
            System.out.println(list1);
            //此时不能使用foreach操作,会报ClassCastException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
