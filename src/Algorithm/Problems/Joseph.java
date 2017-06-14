package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/8.
 * 华为2016校园招聘上机笔试题：约瑟夫环问题
 * 有一个整型数组a[n]顺序存放0~n-1，要求每隔两个数删掉一个数，到末尾循环至开头继续进行，求最后一个被删掉的数的原始下标位置
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
