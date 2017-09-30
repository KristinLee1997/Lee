package Algorithm.Sort;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{2, 6, 1, 3, 8, 5, 4, 7, 9, 0};
        insertionSort(a);
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
        for (int i = 0, pos = 0, n = a.length; i < n - 1; i = n - pos) {
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
        int temp = a[i];
        if (i >= j) return;
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

    public static void quickSort2(int[] a, int start, int end) {
        int i = start;
        int j = end;
        boolean flag = true;
        if (i >= j) return;
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
        quickSort2(a, start, i - 1);
        quickSort2(a, j + 1, end);
    }

    public static void selectionSort(int[] a) {
        for (int i = 0, n = a.length; i < n - 1; i++) {
            int MIN = i;
            for (int j = i; j < n; j++) if (a[MIN] > a[j]) MIN = j;
            if (MIN != i) {
                a[MIN] ^= a[i];
                a[i] ^= a[MIN];
                a[MIN] ^= a[i];
            }
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1, n = a.length; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j] > temp; j--) a[j + 1] = a[j];
            a[j + 1] = temp;
        }
    }
}
