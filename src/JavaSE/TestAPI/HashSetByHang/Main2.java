package JavaSE.TestAPI.HashSetByHang;

import java.util.*;

import static java.util.Collections.*;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("sfas");
        set.add("hang");
        set.add("z");
        set.add("jj");

        String max1 = Collections.max(set);
        System.out.println("max1=" + max1);

        String max2 = getmax2(set);
        System.out.println("max2=" + max2);

        String max3 = getmax3(set);
        System.out.println("max3=" + max3);

        String max4 = getmax4(set);
        System.out.println("max4=" + max4);

        String max5 = getmax5(set, new Comparatorbylength());
        System.out.println("max5=" + max5);
    }

    private static String getmax2(Set<String> set) {
        Iterator<String> it = set.iterator();
        String max = it.next();
        while (it.hasNext()) {
            String current = it.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static String getmax3(Set<String> set) {
        Iterator<String> it = set.iterator();
        Object max = it.next();
        while (it.hasNext()) {
            Object current = it.next();
            Comparable com = (Comparable) current;
            if (com.compareTo(max) > 0) {
                max = com;
            }
        }
        return (String) max;
    }

    public static String getmax4(Set set) {
        Iterator<String> it = set.iterator();
        String max = it.next();
        while (it.hasNext()) {
            String current = it.next();
            Comparator<String> com = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int temp = o1.length() - o2.length();
                    return temp == 0 ? o1.compareTo(o2) : temp;
                }
            };
            if (com.compare(current, max) > 0) {
                max = current;
            }
        }
        return (String) max;
    }

    public static String getmax5(Set set, Comparator com) {
        Iterator<String> it = set.iterator();
        String max = it.next();
        while (it.hasNext()) {
            String current = it.next();
            if (com.compare(current, max) > 0) {
                max = current;
            }
        }
        return (String) max;
    }
}

class Comparatorbylength implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int temp = s1.length() - s2.length();
        return temp == 0 ? s1.compareTo(s2) : temp;
    }
}
