/**
 * Created by king on 2017/4/3.
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 8, 3, 4, 6};
        insertionSort(a);
        for (int i : a) System.out.printf("%d\t", i);
    }

    public static void insertionSort(int[] a) {
        for (int i = 1, n = a.length; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            for (; j >= 0 && temp < a[j]; j--) a[j + 1] = a[j];
            a[j + 1] = temp;
        }
    }
}
