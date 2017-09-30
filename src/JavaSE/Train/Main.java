package JavaSE.Train;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int length = s.length();
        int halflength = 2;
        String news = "";
        String s1 = "";
        String s2 = "";
        news = s.substring(0, length - 2);
        length = length - 2;
        while (halflength > 1) {
            halflength = length / 2;
            s1 = news.substring(0, halflength);
            s2 = news.substring(halflength, length);
            if (s1.equals(s2)) {
                System.out.println(halflength * 2);
                break;
            } else {
                news = s.substring(0, length - 2);
                length = length - 2;
            }
        }
    }
}
