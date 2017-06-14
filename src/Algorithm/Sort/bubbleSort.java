/**
 * Created by king on 2017/4/3.
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 8, 3, 4, 6};
        bubbleSort5(a);
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
            for (int j = 0; j < n - i - 1; j++) {
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
}
