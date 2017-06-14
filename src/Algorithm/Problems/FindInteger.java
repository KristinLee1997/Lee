package Algorithm.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/12.
 * 题意：一个无序数组里有99个不重复的正整数，范围为1-100，唯独缺少一个整数，如何找出这个缺失的整数？
 */
public class FindInteger {
    public static void main(String[] args) {
        int[] num = new int[100];
    }
}

class Function {
    /*方法一：利用HashMap，键值为1-100，读到数组中每一个值，都将以其键对应的值赋为1
    * 时间复杂度：O(N)
    * 空间复杂度：O(N)
    */
    public int fun1(int[] num) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 100; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < num.length; i++) {
            map.put(map.get(num[i]), 1);
        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (map.get(n) == 0) {
                result = n;
            }
        }
        return result;
    }

    /*
    * 方法二：将数组排序，然后比较相邻元素差值是否为1，若差值均为1，则缺少的数字为1或100；若不为一，则找到缺少的数字
    * 时间复杂度：O(N*logN)
    * 空间复杂度：O(1)
    */
    public int fun2(int[] num) {
        int result = 0;
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (num[i + 1] - num[i] != 1) {
                result = (num[i] + num[i + 1]) / 2;
            }
        }
        if (result == 0 && num[0] != 1) {
            result = 1;
        } else if (result == 0 && num[num.length - 1] != 100) {
            result = 100;
        }
        return result;
    }

    /*
    * 方法三：开辟两个数组分别存放整数的十位和个位，找到每个数组元素为九的角标，然后找到相应的整数
    * 时间复杂度:O(N)
    * 空间复杂度:O(20)
    */
    public int fun3(int[] num) {
        int result = 0;
        return result;
    }


    /*
    * 方法四：直接算出1+2+3+...+100的值，然后依次减去数组中的每一元素，即可得到缺失的整数
    *时间复杂度：O(N)
    *空间复杂度：O(1)
    * */
    public int fun4(int[] num) {
        int result = 0;
        int sum = (1 + 100) * 100 / 2;
        for (int i = 0; i < num.length; i++) {
            sum -= num[i];
        }
        result = sum;
        return result;
    }
}