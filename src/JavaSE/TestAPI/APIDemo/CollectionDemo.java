package JavaSE.TestAPI.APIDemo;

import java.util.*;

/**
 * Created by Administrator on 2017/5/21.
 * -------Collection接口api练习----------
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        //new CollectionDemo().collectionDemo1(c1);
        new CollectionDemo().collectionDemo2(c1, c2);
    }

    /**
     * 演示Collection一般方法
     */
    public void collectionDemo1(Collection c) {
        c.add(1);
        c.add(3);
        c.add(5);
        c.add(7);
        System.out.println(c.contains(3));//判断集合中是否含有某元素

        System.out.println(c);
        c.clear();//清空
    }

    /**
     * 演示Collection带all方法
     */
    public void collectionDemo2(Collection c1, Collection c2) {
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c2.add("abc1");
        c2.add("abc5");
        c2.add("abc6");
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
//        c1.addAll(c2);      //将集合c2全部元素都追加到c1末尾
//        System.out.println(c1);

//        boolean b=c1.contains(c2);        // 判断c1是否包含c2的全部元素
//        System.out.println(b);

//        c1.removeAll(c2);          //将c1中所包含的c2的所有元素删除
//        System.out.println(c1);
//
        c1.retainAll(c2);         //保留c1，c2共同的部分
        System.out.println(c1);
    }

}
