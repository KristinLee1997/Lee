package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/8.
 * ��Ϊ2016У԰��Ƹ�ϻ������⣺Լɪ������
 * ��һ����������a[n]˳����0~n-1��Ҫ��ÿ��������ɾ��һ��������ĩβѭ������ͷ�������У������һ����ɾ��������ԭʼ�±�λ��
 */
public class Joseph {
    public static void main(String[] args) {
        System.out.println(new Joseph().fun());
    }

    public int fun() {
        int len = 8;
        int counter = 1;
        int kill = 3;
        int scan = 0, in = len;
        int[] arr = new int[100];
        for (int i = 0; i < len; i++) arr[i] = i;
        while (scan + 1 < in) {
            if (counter % kill == 0) {
                scan++;
            } else {
                arr[in++] = arr[scan++];
            }
            counter++;
        }
        return arr[scan];
    }
}
