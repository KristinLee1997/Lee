package Algorithm.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/12.
 * ���⣺һ��������������99�����ظ�������������ΧΪ1-100��Ψ��ȱ��һ������������ҳ����ȱʧ��������
 */
public class FindInteger {
    public static void main(String[] args) {
        int[] num = new int[100];
    }
}

class Function {
    /*����һ������HashMap����ֵΪ1-100������������ÿһ��ֵ�������������Ӧ��ֵ��Ϊ1
    * ʱ�临�Ӷȣ�O(N)
    * �ռ临�Ӷȣ�O(N)
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
    * ������������������Ȼ��Ƚ�����Ԫ�ز�ֵ�Ƿ�Ϊ1������ֵ��Ϊ1����ȱ�ٵ�����Ϊ1��100������Ϊһ�����ҵ�ȱ�ٵ�����
    * ʱ�临�Ӷȣ�O(N*logN)
    * �ռ临�Ӷȣ�O(1)
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
    * ��������������������ֱ���������ʮλ�͸�λ���ҵ�ÿ������Ԫ��Ϊ�ŵĽǱ꣬Ȼ���ҵ���Ӧ������
    * ʱ�临�Ӷ�:O(N)
    * �ռ临�Ӷ�:O(20)
    */
    public int fun3(int[] num) {
        int result = 0;
        return result;
    }


    /*
    * �����ģ�ֱ�����1+2+3+...+100��ֵ��Ȼ�����μ�ȥ�����е�ÿһԪ�أ����ɵõ�ȱʧ������
    *ʱ�临�Ӷȣ�O(N)
    *�ռ临�Ӷȣ�O(1)
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