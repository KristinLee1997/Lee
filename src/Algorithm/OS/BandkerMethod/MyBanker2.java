package Algorithm.OS.BandkerMethod;

/**
 * Created by Administrator on 2017/6/14.
 */

import java.util.Scanner;

public class MyBanker2 {
    int threadNum = 5;
    int sourceNum = 3;

    int available[] = new int[]{2, 3, 3};//可得到的资源

    int max[][] = new int[][]{{5, 5, 9}, {5, 3, 6}, {4, 0, 11}, {4, 2, 5}, {4, 2, 4}};//每个进程最大资源数

    int allocation[][] = new int[][]{{2, 1, 2}, {4, 0, 2}, {4, 0, 5}, {2, 0, 4}, {3, 1, 4}};//每个进程目前拥有的资源数

    int need[][] = new int[][]{{3, 4, 7}, {1, 3, 4}, {0, 0, 6}, {2, 2, 1}, {1, 1, 0}};//每个进程需要的资源数

    void showData() {//展示数据输出每个进程的相关数据
        System.out.println("进程号\t\tMax\t\t\tAllocation\t\t\tNeed");
        System.out.println("\t\tA\tB\tC\t\tA\tB\tC\t\tA\tB\tC\n");
        for (int i = 0; i < threadNum; i++) {
            System.out.print(i + "\t\t");
            for (int m = 0; m < sourceNum; m++) System.out.print(max[i][m] + "\t");
            System.out.print("\t");
            for (int m = 0; m < sourceNum; m++) System.out.print(allocation[i][m] + "\t");
            System.out.print("\t");
            for (int m = 0; m < sourceNum; m++) System.out.print(need[i][m] + "\t");
            System.out.println();
        }
    }

    boolean change(int inRequestNum, int inRequest[], int inRequestNum2, int inRequest2[]) {//分配数据
        int requestNum = inRequestNum;
        int requestNum2 = inRequestNum2;
        int request[] = inRequest;
        int request2[] = inRequest2;
        if (!(request[0] <= need[requestNum][0] && request[1] <= need[requestNum][1] && request[2] <= need[requestNum][2])) {
            System.out.println("请求的资源数超过了所需要的最大值，分配错误");
            return false;
        }

        if (!(request2[0] <= need[requestNum2][0] && request2[1] <= need[requestNum2][1] && request2[2] <= need[requestNum2][2])) {
            System.out.println("请求的资源数超过了所需要的最大值，分配错误");
            return false;
        }

        if ((request[0] + request2[0] <= available[0] && request[1] + request2[1] <= available[1] && request[2] + request2[2] <= available[2]) == false) {
            System.out.println("尚无足够资源分配，必须等待");
            return false;
        }
        for (int i = 0; i < sourceNum; i++) {//试分配数据给请求的线程
            available[i] = available[i] - request[i];
            allocation[requestNum][i] = allocation[requestNum][i] + request[i];
            need[requestNum][i] = need[requestNum][i] - request[i];

            available[i] = available[i] - request2[i];
            allocation[requestNum2][i] = allocation[requestNum2][i] + request2[i];
            need[requestNum2][i] = need[requestNum2][i] - request2[i];
        }
        boolean flag = checkSafe(available[0], available[1], available[2]);//进行安全性检查并返回是否安全
        if (flag == true) {
            System.out.println("能够安全分配");
            return true;
        } else {//不能通过安全性检查 恢复到未分配前的数据
            System.out.println("不能够安全分配");
            for (int i = 0; i < sourceNum; i++) {
                available[i] = available[i] + request[i];
                allocation[requestNum][i] = allocation[requestNum][i] - request[i];
                need[requestNum][i] = need[requestNum][i] + request[i];

                available[i] = available[i] + request2[i];
                allocation[requestNum2][i] = allocation[requestNum2][i] - request2[i];
                need[requestNum2][i] = need[requestNum2][i] + request2[i];
            }
            return false;
        }
    }

    boolean checkSafe(int a, int b, int c) {//安全性检查
        int work[] = new int[sourceNum];
        work[0] = a;
        work[1] = b;
        work[2] = c;
        int i = 0;
        boolean finish[] = new boolean[threadNum];
        while (i < threadNum) {//寻找一个能够满足的认为完成后才去执行下一进程
            if (finish[i] == false && need[i][0] <= work[0] && need[i][1] <= work[1] && need[i][2] <= work[2]) {//找到满足的修改work值，然后i=0，重新从开始的为分配的中寻找
                System.out.println("分配成功的是" + i);
                for (int m = 0; m < sourceNum; m++)
                    work[m] = work[m] + allocation[i][m];
                finish[i] = true;
                i = 0;
            } else//如果没有找到直接i++
                i++;
        }
        for (i = 0; i < threadNum; i++) {//通过finish数组判断是否都可以分配
            if (finish[i] == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyBanker2 bank = new MyBanker2();
        bank.showData();
        int request[] = new int[3];
        int request2[] = new int[3];
        int requestNum, requestNum2;
        String source[] = new String[]{"A", "B", "C"};
        Scanner s = new Scanner(System.in);
        String choice = new String();
        while (true) {//循环进行分配
            System.out.println("请输入要请求的进程号（0--4）：");
            requestNum = s.nextInt();
            System.out.print("请输入请求的资源数目");
            for (int i = 0; i < bank.sourceNum; i++) {
                System.out.println(source[i] + "资源的数目：");
                request[i] = s.nextInt();
            }

            System.out.println("请输入要请求的进程号（0--4）：");
            requestNum2 = s.nextInt();
            System.out.print("请输入请求的资源数目");
            for (int i = 0; i < bank.sourceNum; i++) {
                System.out.println(source[i] + "资源的数目：");
                request2[i] = s.nextInt();
            }

            bank.change(requestNum, request, requestNum2, request2);
            System.out.println("是否再请求分配(y/n)");
            choice = s.next();
            if (choice.equals("n")) break;
        }
    }
}
