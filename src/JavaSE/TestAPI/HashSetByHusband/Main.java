package JavaSE.TestAPI.HashSetByHusband;

import java.util.*;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("absadf");//abc abca
        set.add("z");
        set.add("sorry");
        set.add("hang");
        set.add("tu");
        String max = Collections.max(set);
        System.out.println(max);

        String max1 = getMax1(set);
        System.out.println(max1);

        String max2 = getMax2(set);
        System.out.println(max2);

        String max3 = getMax3(set);
        System.out.println(max3);

        String max4 = getMax4(set, new CompareByLength());
        System.out.println(max4);
    }

    private static String getMax1(Set<String> set) {
        Iterator<String> iter = set.iterator();
        String max = iter.next();
        while (iter.hasNext()) {
            String current = iter.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    private static String getMax2(Set<String> set) {
        Iterator<String> iter = set.iterator();
        Object max = iter.next();
        while (iter.hasNext()) {
            String current = iter.next();
//            Object obj=(Object)current;
            Comparable com = (Comparable) current;
            if (com.compareTo(max) > 0) {
                max = com;
            }
        }
        return (String) max;
    }

    private static String getMax3(Set<String> set) {
        Iterator<String> iter = set.iterator();
        String max = iter.next();
        while (iter.hasNext()) {
            String current = iter.next();
            Comparator<String> com = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int sub = o1.length() - o2.length();
                    return sub == 0 ? o1.compareTo(o2) : sub;
                }
            };
            if (com.compare(current, max) > 0) {
                max = current;
            }
        }
        return max;
    }

    private static String getMax4(Set<String> set, Comparator<String> com) {
        Iterator<String> iter = set.iterator();
        String max = iter.next();
        while (iter.hasNext()) {
            String current = iter.next();

            if (com.compare(current, max) > 0) {
                max = current;
            }
        }
        return max;
    }
}

class CompareByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int sub = s1.length() - s2.length();
        return sub == 0 ? s1.compareTo(s2) : sub;
    }
}

/*

interface ��ͼ����1{
    void ��ť();
    void ����();
    void ����();
    void д�ְ�();
    void ��ɫ��();
    void ����();
    void �߿�();
}

class A implements ��ͼ����1{

    @Override
    public void ��ť() {

    }

    @Override
    public void ����() {

    }

    @Override
    public void ����() {

    }

    @Override
    public void д�ְ�() {
        init();
        use();
    }

    @Override
    public void ��ɫ��() {

    }

    @Override
    public void ����() {
        setBackGround(white);
    }

    @Override
    public void �߿�() {

    }
}




class ��ͼ����2{
    void ��ť(){}
    void ����(){}
    void ����(){}
    void д�ְ�(){}
    void ��ɫ��(){}
    void ����(){}
    void �߿�(){}
}

class B extends ��ͼ����2{
    public void д�ְ�(){
        init();
        use();
    }
    void ����(){
        setBackGround(white);
    }
}*/

/*

class A extends Animal implements ��,��,��,��Ӿ{

}

*/
