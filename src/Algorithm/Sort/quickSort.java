/**
 * Created by king on 2017/4/3.
 */
public class quickSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 6, 1, 3, 8, 5, 4, 7, 9, 0};
        quickSort2(a, 0, a.length - 1);
        for (int i : a) System.out.printf("%d\t", i);
    }

    public static void quickSort1(int[] a, int start, int end) {
        int i = start;
        int j = end;
        if (start >= end) return;
        boolean flag = true;
        while (i != j) {
            if (a[i] > a[j]) {
                a[i] ^= a[j];
                a[j] ^= a[i];
                a[i] ^= a[j];
                flag = !flag;
            }
            if (!flag) i++;
            else j--;
        }
        quickSort1(a, start, i - 1);
        quickSort1(a, j + 1, end);
    }

    public static void quickSort2(int a[], int start, int end) {
        int i = start;
        int j = end;
        int temp = a[i];
        if (i >= j) return;
        while (i < j) {
            while (i < j && a[j] >= temp) j--;
            a[i] = a[j];
            while (i < j && a[i] <= temp) i++;
            a[j] = a[i];
        }
        a[i] = temp;
        quickSort2(a, start, i - 1);
        quickSort2(a, j + 1, end);
    }
}