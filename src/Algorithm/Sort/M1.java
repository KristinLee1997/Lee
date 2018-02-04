package Algorithm.Sort;

/**
 * Created by king on 2017/4/4.
 */
public class M1 {
    public static void main(String[] args) {
        int[] a = new int[]{8, 2, 1, 6, 3, 9, 5, 0, 4, 7};
//        shellSort(a);
        quickSort2(a,0,a.length-1);
        for (int i : a) System.out.printf("%d\t", i);
    }

    public static void bubbleSort1(int[] a) {
        for (int i = 0, n = a.length; i < n - 1; i--) {
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
                    a[i - 1] = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = a[i];
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
            if (!b) return;
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

    public static void selectionSort(int[] a) {
        for (int i = 0, n = a.length; i < n - 1; i++) {
            int MIN = i;
            for (int j = i; j < n; j++) if (a[MIN] > a[j]) MIN = j;
            if (i != MIN) {
                a[MIN] ^= a[i];
                a[i] ^= a[MIN];
                a[MIN] ^= a[i];
            }
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1, n = a.length; i < n; i++) {
            int j = i - 1;
            int temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) a[j + 1] = a[j];
            a[j + 1] = temp;
        }
    }

    public static void quickSort1(int[] num, int low, int high) {
        int i = low;
        int j = high;
        if (i >= j) {
            return;
        }
        boolean flag = true;
        while (i != j) {
            if (num[i] > num[j]) {
                int t = num[i];
                num[i] = num[j];
                num[j] = t;
                flag = (flag == true) ? false : true;
            }
            if (flag) {
                j--;
            } else {
                i++;
            }
        }
        i--;
        j++;
        quickSort1(num, low, i);
        quickSort1(num, j, high);
    }

    public static void quickSort2(int[] a, int start, int end) {
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

    public static void shellSort(int[] a) {
        for (int n = a.length, r = n / 2; r >= 1; r /= 2) {
            for (int i = r; i < n; i++) {
                int temp = a[i];
                int j = i - r;
                while (j >= 0 && temp < a[j]) {
                    a[j + r] = a[j];
                    j -= r;
                }
                a[j + r] = temp;
            }
        }
    }

    public static void binaryInsertionSort(int[] a) {
        //最初的第一个元素想象成已经排好的序列
        //遍历后面的元素，将其插入到已排序好的序列中
        for (int i = 1; i < a.length; i++) {
            int low = 0;//已经排序号的序列的最低位置
            int high = i - 1;//已经排序号的序列的最高位置
            int temp = a[i];//每次将array[i]插入到以排序的序列中
            while (low <= high)//二分查找
            {
                int mid = (low + high) / 2;
                if (a[mid] > temp) high = mid - 1;
                else low = mid + 1;
            }
            //找到插入点后，为该值腾出地方，将high+1到i的所有元素后移一位
            for (int j = i - 1; j > high; j--) a[j + 1] = a[j];
            a[high + 1] = temp;
        }
    }

    public static void gnomesort(int[] a) {
        int i = 0;
        while (i < a.length) {
            if (i == 0 || a[i - 1] <= a[i]) i++;
            else {
                int tmp = a[i];
                a[i] = a[i - 1];
                a[--i] = tmp;
            }
        }
    }

    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low & high) + ((low ^ high) >> 1);
            if (x < a[mid]) {
                high = mid - 1;
            } else if (x > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
