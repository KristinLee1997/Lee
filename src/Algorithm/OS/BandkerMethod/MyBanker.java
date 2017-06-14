package Algorithm.OS.BandkerMethod;

/**
 * Created by Administrator on 2017/6/14.
 *系统中有3种类型的资源ReplacementMothod B C和5个进程P1、P2、P3、P4、P5 A资源的数量为17 B资源的数量为5 C资源的数量为20。在T0时刻系统状态见下表T0时刻系统状态表所示。系统采用银行家算法实施死锁避免策略。
 *最大资源需求量    已分配资源数量
 *ReplacementMothod    B    C     ReplacementMothod    B    C
 *P1   5    5    9     2    1    2
 *P2   5    3    6     4    0    2
 *P3   4    0    11    4    0    5
 *P4   4    2    5     2    0    4
 *P5   4    2    4     3    1    4
 *T0时刻系统状态表

 *( 1)T0时刻是否为安全状态,若是请给出安全序列。
 *(2)在T0时刻若进程P2请求资源0 3 4 是否能实施资源分配，为什么？
 *(3)在(2)的基础上 若进程P4请求资源2 0 1 是否能实施资源分配，为什么？
 *(4)在(3)的基础上 若进程P1请求资源0 2 0 是否能实施资源分配，为什么？
 */

import java.util.Scanner;

public class MyBanker {
    int threadNum = 5;
    int sourceNum = 3;

    int available[] = new int[]{2, 3, 3};//可得到的资源

    int max[][] = new int[][]{{5, 5, 9}, {5, 3, 6}, {4, 0, 11}, {4, 2, 5}, {4, 2, 4}};//每个进程最大资源数

    int allocation[][] = new int[][]{{2, 1, 2}, {4, 0, 2}, {4, 0, 5}, {2, 0, 4}, {3, 1, 4}};//每个进程目前拥有的资源数

    int need[][] = new int[][]{{3, 4, 7}, {1, 3, 4}, {0, 0, 6}, {2, 2, 1}, {1, 1, 0}};//每个进程需要的资源数

    void showData() {//展示数据输出每个进程的相关数据
        System.out.println("进程号\t\tMax\t\t\tAllocation\t\t\tNeed");
        System.out.println("\t\tReplacementMothod\tB\tC\t\tReplacementMothod\tB\tC\t\tReplacementMothod\tB\tC\n");
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

    boolean change(int inRequestNum, int inRequest[]) {//分配数据
        int requestNum = inRequestNum;
        int request[] = inRequest;
        if (!(request[0] <= need[requestNum][0] && request[1] <= need[requestNum][1] && request[2] <= need[requestNum][2])) {
            System.out.println("请求的资源数超过了所需要的最大值，分配错误");
            return false;
        }
        if ((request[0] <= available[0] && request[1] <= available[1] && request[2] <= available[2]) == false) {
            System.out.println("尚无足够资源分配，必须等待");
            return false;
        }
        for (int i = 0; i < sourceNum; i++) {//试分配数据给请求的线程
            available[i] = available[i] - request[i];
            allocation[requestNum][i] = allocation[requestNum][i] + request[i];
            need[requestNum][i] = need[requestNum][i] - request[i];
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
        MyBanker bank = new MyBanker();
        bank.showData();
        int request[] = new int[3];
        int requestNum;
        String source[] = new String[]{"ReplacementMothod", "B", "C"};
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
            bank.change(requestNum, request);
            System.out.println("是否再请求分配(y/n)");
            choice = s.next();
            if (choice.equals("n")) break;
        }
    }
}
