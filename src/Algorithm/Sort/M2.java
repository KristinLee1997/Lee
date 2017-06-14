/**
 * Created by king on 2017/4/6.
 */
public class M2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 6, 3, 8, 2, 7};
        quickSort1(a, 0, a.length - 1);
        for (int i : a) System.out.printf("%d\t", i);
    }

    public static void bubbleSort1(int[] a) {
        for (int i = 0, n = a.length; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                }
            }
        }
    }

    public static void bubbleSort2(int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            for (int i = low; i < high; i++) {
                if (a[i] > a[i + 1]) {
                    a[i] ^= a[i + 1];
                    a[i + 1] ^= a[i];
                    a[i] ^= a[i + 1];
                }
            }
            high--;
            for (int i = high; i > low; i--) {
                if (a[i - 1] > a[i]) {
                    a[i - 1] ^= a[i];
                    a[i] ^= a[i - 1];
                    a[i - 1] ^= a[i];
                }
            }
            low++;
        }
    }

    public static void bubbleSort3(int[] a) {
        for (int i = 0, n = a.length, exchange = 1; i < n - 1 && exchange == 1; i++) {
            exchange = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                    exchange = 1;
                }
            }
        }
    }

    public static void bubbleSort4(int[] a) {
        for (int i = 0, n = a.length; i < n - 1; i++) {
            boolean b = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                    b = true;
                }
            }
            if (!b) break;
        }
    }

    public static void bubbleSort5(int[] a) {
        for (int i = 0, n = a.length, pos = 0; i < n - 1; i = n - pos) {
            pos = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                    pos = j + 1;
                }
            }
        }
    }

    public static void quickSort1(int[] a, int start, int end) {
        int i = start;
        int j = end;
        if (i >= j) return;
        int temp = a[i];
        while (i < j) {
            while (i < j && a[j] > temp) j--;
            a[i] = a[j];
            while (i < j && a[i] < temp) i++;
            a[j] = a[i];
        }
        a[i] = temp;
        quickSort1(a, start, i - 1);
        quickSort1(a, j + 1, end);
    }
}