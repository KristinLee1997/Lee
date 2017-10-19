package Algorithm;

import Algorithm.leetcode.HammingDistance;

import java.io.PrintWriter;
import java.util.*;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/30 10:47
 * Goal:
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        List list1 = new ArrayList();
        List list2=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int s = r.nextInt(26) + 97;
            list1.add(s);
        }
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            int temp=(int)list1.get(i);
            list2.add(((char) temp));
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list2.get(19-i)+" ");
        }
    }
}
