package JavaSE.TestAPI.APIDemo;

import java.util.*;

/**
 * Created by Administrator on 2017/5/21.
 * -------Collection�ӿ�api��ϰ----------
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        //new CollectionDemo().collectionDemo1(c1);
        new CollectionDemo().collectionDemo2(c1, c2);
    }

    /**
     * ��ʾCollectionһ�㷽��
     */
    public void collectionDemo1(Collection c) {
        c.add(1);
        c.add(3);
        c.add(5);
        c.add(7);
        System.out.println(c.contains(3));//�жϼ������Ƿ���ĳԪ��

        System.out.println(c);
        c.clear();//���
    }

    /**
     * ��ʾCollection��all����
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
//        c1.addAll(c2);      //������c2ȫ��Ԫ�ض�׷�ӵ�c1ĩβ
//        System.out.println(c1);

//        boolean b=c1.contains(c2);        // �ж�c1�Ƿ����c2��ȫ��Ԫ��
//        System.out.println(b);

//        c1.removeAll(c2);          //��c1����������c2������Ԫ��ɾ��
//        System.out.println(c1);
//
        c1.retainAll(c2);         //����c1��c2��ͬ�Ĳ���
        System.out.println(c1);
    }

}
