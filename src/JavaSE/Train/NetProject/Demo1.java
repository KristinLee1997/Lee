package JavaSE.Train.NetProject;

/**
 * Created by Administrator on 2017/5/23.
 */

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String comStr = "1101";
        while (input.hasNext()) {
            StringBuffer str = new StringBuffer();
            StringBuffer aStr = new StringBuffer();
            str.append(input.next());
            String res = str.toString();
            str.append("000");
            str = delete(str);
            aStr.append(str.substring(0, 3));
            for (int i = 3; i < str.length(); i++) {
                aStr.append(str.charAt(i));
                if (Integer.valueOf(aStr.toString(), 2) != 0) aStr = delete(aStr);
                if (aStr.length() < 4) continue;
                int ia = Integer.valueOf(aStr.toString(), 2);
                int ip = Integer.valueOf(comStr.toString(), 2);
                aStr = new StringBuffer(Integer.toBinaryString(ip ^ ia));
            }
            while (aStr.length() < 3) aStr.insert(0, 0);
            if (aStr.toString().equals("1101")) aStr = new StringBuffer("000");
            aStr.insert(0, res);
            System.out.printf("%s\n", aStr);
        }
    }

    public static StringBuffer delete(StringBuffer s) {
        int i = 0;
        for (i = 0; s.charAt(i) == '0'; i++) ;
        return s.delete(0, i);
    }
}


