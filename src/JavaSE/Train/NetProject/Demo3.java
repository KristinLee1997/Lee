package Train.NetProject;

/**
 * Created by Administrator on 2017/5/23.
 */

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strChecksum = new String();
        int checksum = 0;
        int a = 0, b = 0, count = 0;
        String num[] = new String[20];
        while (input.hasNext()) {
            num[count] = new String("");
            num[count++] = input.next();
        }
        switch (num[0].length()) {
            case 4: {
                a = 0x0000000F;
                b = 0x00000010;
                strChecksum = "0000";
                break;
            }
            case 8: {
                a = 0x000000FF;
                b = 0x00000100;
                strChecksum = "00000000";
                break;
            }
            case 16: {
                a = 0x0000FFFF;
                b = 0x00010000;
                strChecksum = "0000000000000000";
                break;
            }
        }
        checksum = sum(num, count, a, b);
        if (checksum == a) System.out.println("no error introduced.");
        else System.out.println("error introduced.");
    }

    public static void cal(String num[], int count) {
        char c[] = new char[num[0].length()];
        for (int i = 0; i < count; i++) {
            c = num[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] == '0') c[j] = '1';
                else c[j] = '0';
            }
            num[i] = String.valueOf(c);
        }
    }

    public static int sum(String num[], int count, int tmp2, int carry) {
        int len = num.length;
        int index = 0, sum = 0;
        cal(num, count);
        while (index < count) {
            int tmp1 = Integer.parseInt(num[index], 2);
            tmp1 &= tmp2;
            sum += tmp1;
            if ((sum & carry) != 0) {
                sum &= tmp2;
                sum++;
            }
            index++;
        }
        return sum;
    }
}

