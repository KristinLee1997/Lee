package JavaSE.TestAPI.HashSetByHang;

import java.util.*;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("sfas");
        set.add("hang");
        set.add("z");
        set.add("jj");
        String max1 = Collections.max(set);
        System.out.println("max1=" + max1);

        String max2 = getMax2(set);
        System.out.println("max2=" + max2);

        String max3 = getMax3(set);
        System.out.println("max3=" + max3);

        String max4 = getMax4(set);
        System.out.println("max4=" + max4);

        String max5 = getMax5(set, new ComparatorByLength());
        System.out.println("max5=" + max5);
    }

    public static String getMax2(Set<String> set) {
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

    public static String getMax3(Set<String> set) {
        Iterator<String> it = set.iterator();
        String max = it.next();
        while (it.hasNext()) {
            String current = it.next();
            Comparable com = (Comparable) current;
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static String getMax4(Set<String> set) {
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

    public static String getMax5(Set<String> set, Comparator com) {
        Iterator<String> it = set.iterator();
        String max = it.next();
        while (it.hasNext()) {
            String current = it.next();

            if (com.compare(current, max) > 0) {
                max = current;
            }
        }
        return max;
    }
}

class ComparatorByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int temp = s1.length() - s2.length();
        return temp == 0 ? s1.compareTo(s2) : temp;
    }
}