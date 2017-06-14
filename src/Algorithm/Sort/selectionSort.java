/**
 * Created by king on 2017/4/3.
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 3, 2, 7, 8, 2, 1};
        selectionSort(a);
        for (int i : a) System.out.printf("%d\t", i);
    }

    public static void selectionSort(int[] a) {
        for (int i = 0, n = a.length; i < n; i++) {
            int MIN = i;
            for (int j = i + 1; j < n; j++) if (a[MIN] > a[j]) MIN = j;
            if (MIN != i) {
                a[i] ^= a[MIN];
                a[MIN] ^= a[i];
                a[i] ^= a[MIN];
            }
        }
    }
}
