package JavaSE.Train;

import java.util.*;

/**
 * Created by Administrator on 2017/5/22.
 */
public class CRC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str1 = str + "000";
        String comstr = "1101";
        String result = str1.substring(0, 4);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            String resstr = "";
            for (int j = 0; j < 4; j++) {
                count++;
                if (result.charAt(j) == comstr.charAt(j)) {
                    resstr += "0";
                } else {
                    resstr += "1";
                }
            }
            result = resstr;
            System.out.println("result=" + result);
            System.out.println("count=" + count);
            result = result.substring(result.indexOf('1'), result.length()) + str1.substring(count - result.indexOf('1'), count);
        }
        System.out.println(str + result.substring(result.length() - 3, result.length()));
    }
}
