package Algorithm.Sort;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/30 11:30
 * Goal:
 **/

public class Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        Scanner scan = new Scanner(System.in);
        int[] num = {1, 5, 9, 7, 3, 6, 2, 5};
        System.out.println("请输入排序算法的序号:");
        System.out.println("-------------------------");
        System.out.println("1.直接插入排序");
        System.out.println("2.二分法插入排序");
        System.out.println("-------------------------");
        String n = scan.nextLine();
        switch (n) {
            case "1":
                System.out.println("直接插入排序:");
                s.insertionSort(num);
                break;
            case "2":
                System.out.println("二分法插入排序:");
                s.twodivSort(num);
                break;
            default:
                System.out.println(".....");
                break;
        }
    }

    public void insertionSort(int[] num) {  //插入排序—直接插入排序(Straight Insertion Sort)
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int j = i - 1;
            for (; j >= 0 && num[j] > temp; j--) num[j + 1] = num[j];
            num[j + 1] = temp;
        }
        display(num);
    }

    public void twodivSort(int[] num) {//二分插入排序
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (temp < num[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                num[j + 1] = num[j];
            }
            if (left != i) {
                num[left] = temp;
            }
        }
        display(num);
    }


    public void display(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
