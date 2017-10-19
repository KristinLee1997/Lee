package Algorithm.mianshi.sort;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/10/16 22:41
 * Goal:
 **/
public class Sort {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 9, 7, 3, 8, 2, 4, 6};
        Sort.insertsort(num);
        Sort.print(num);
    }

    public static void bubblesort1(int[] num) { //ª˘¥°√∞≈›≈≈–Ú
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesort2(){

    }


    public static void selectsort(int[] num) { //—°‘Ò≈≈–Ú
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = num[i];
                num[i] = num[min];
                num[min] = temp;
            }
        }
    }

    public static void insertsort(int[] num) {//≤Â»Î≈≈–Ú
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int j = i - 1;
            for (; j >= 0 && temp < num[j]; j--) num[j + 1] = num[j];
            num[j + 1] = temp;
        }
    }

    public static void mergesort(int[] num) {//πÈ≤¢≈≈–Ú

    }

    public static void print(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
