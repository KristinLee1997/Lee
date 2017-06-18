package JavaSE.Test;

/**
 * Created by Administrator on 2017/6/16.
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int count = count(n, k);
        System.out.println(count);
    }

    public static int count(int n, int k) {
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = 0;
        }
        int[] num2 = new int[k];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num2.length && num[i] != 1; j++) {
                num2[j] = i;
                num[i] = 1;
            }
            for (int z = 0; i < num2.length; z++) {
                sum += num2[z];
            }
            if (sum % n == 0) {
                count++;
            }
        }
        return count;
    }
}
