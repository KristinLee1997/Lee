package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/13.0
 */
import java.util.Arrays;

public class Jiao {
    public static void main(String[] args) {
        int[] num1 = new int[] { 1, 2, 3, 5, 4 };
        int[] num2 = new int[] { 1, 5, 9, 7, 3, 6 };
        Arrays.sort(num1);
        Arrays.sort(num2);
        int a = 0;
        int b = 0;
        while (a < num1.length && b <num2.length) {
            if (num1[a] == num2[b]) {
                System.out.print(num1[a]+" ");
                a++;
                b++;
            } else if (num1[a] < num2[b]) {
                a++;
            } else if (num1[a] > num2[b]) {
                b++;
            }
        }
    }
}

