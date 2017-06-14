package Algorithm.OS.BandkerMethod;

/**
 * Created by Administrator on 2017/6/14.
 *ϵͳ����3�����͵���Դ��ReplacementMothod B C��5������P1��P2��P3��P4��P5 A��Դ������Ϊ17 B��Դ������Ϊ5 C��Դ������Ϊ20����T0ʱ��ϵͳ״̬���±�T0ʱ��ϵͳ״̬����ʾ��ϵͳ�������м��㷨ʵʩ����������ԡ�
 *�����Դ������    �ѷ�����Դ����
 *ReplacementMothod    B    C     ReplacementMothod    B    C
 *P1   5    5    9     2    1    2
 *P2   5    3    6     4    0    2
 *P3   4    0    11    4    0    5
 *P4   4    2    5     2    0    4
 *P5   4    2    4     3    1    4
 *T0ʱ��ϵͳ״̬��

 *( 1)T0ʱ���Ƿ�Ϊ��ȫ״̬,�����������ȫ���С�
 *(2)��T0ʱ��������P2������Դ��0 3 4 �Ƿ���ʵʩ��Դ���䣬Ϊʲô��
 *(3)��(2)�Ļ����� ������P4������Դ��2 0 1 �Ƿ���ʵʩ��Դ���䣬Ϊʲô��
 *(4)��(3)�Ļ����� ������P1������Դ��0 2 0 �Ƿ���ʵʩ��Դ���䣬Ϊʲô��
 */

import java.util.Scanner;

public class MyBanker {
    int threadNum = 5;
    int sourceNum = 3;

    int available[] = new int[]{2, 3, 3};//�ɵõ�����Դ

    int max[][] = new int[][]{{5, 5, 9}, {5, 3, 6}, {4, 0, 11}, {4, 2, 5}, {4, 2, 4}};//ÿ�����������Դ��

    int allocation[][] = new int[][]{{2, 1, 2}, {4, 0, 2}, {4, 0, 5}, {2, 0, 4}, {3, 1, 4}};//ÿ������Ŀǰӵ�е���Դ��

    int need[][] = new int[][]{{3, 4, 7}, {1, 3, 4}, {0, 0, 6}, {2, 2, 1}, {1, 1, 0}};//ÿ��������Ҫ����Դ��

    void showData() {//չʾ�������ÿ�����̵��������
        System.out.println("���̺�\t\tMax\t\t\tAllocation\t\t\tNeed");
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

    boolean change(int inRequestNum, int inRequest[]) {//��������
        int requestNum = inRequestNum;
        int request[] = inRequest;
        if (!(request[0] <= need[requestNum][0] && request[1] <= need[requestNum][1] && request[2] <= need[requestNum][2])) {
            System.out.println("�������Դ������������Ҫ�����ֵ���������");
            return false;
        }
        if ((request[0] <= available[0] && request[1] <= available[1] && request[2] <= available[2]) == false) {
            System.out.println("�����㹻��Դ���䣬����ȴ�");
            return false;
        }
        for (int i = 0; i < sourceNum; i++) {//�Է������ݸ�������߳�
            available[i] = available[i] - request[i];
            allocation[requestNum][i] = allocation[requestNum][i] + request[i];
            need[requestNum][i] = need[requestNum][i] - request[i];
        }
        boolean flag = checkSafe(available[0], available[1], available[2]);//���а�ȫ�Լ�鲢�����Ƿ�ȫ
        if (flag == true) {
            System.out.println("�ܹ���ȫ����");
            return true;
        } else {//����ͨ����ȫ�Լ�� �ָ���δ����ǰ������
            System.out.println("���ܹ���ȫ����");
            for (int i = 0; i < sourceNum; i++) {
                available[i] = available[i] + request[i];
                allocation[requestNum][i] = allocation[requestNum][i] - request[i];
                need[requestNum][i] = need[requestNum][i] + request[i];
            }
            return false;
        }
    }

    boolean checkSafe(int a, int b, int c) {//��ȫ�Լ��
        int work[] = new int[sourceNum];
        work[0] = a;
        work[1] = b;
        work[2] = c;
        int i = 0;
        boolean finish[] = new boolean[threadNum];
        while (i < threadNum) {//Ѱ��һ���ܹ��������Ϊ��ɺ��ȥִ����һ����
            if (finish[i] == false && need[i][0] <= work[0] && need[i][1] <= work[1] && need[i][2] <= work[2]) {//�ҵ�������޸�workֵ��Ȼ��i=0�����´ӿ�ʼ��Ϊ�������Ѱ��
                System.out.println("����ɹ�����" + i);
                for (int m = 0; m < sourceNum; m++)
                    work[m] = work[m] + allocation[i][m];
                finish[i] = true;
                i = 0;
            } else//���û���ҵ�ֱ��i++
                i++;
        }
        for (i = 0; i < threadNum; i++) {//ͨ��finish�����ж��Ƿ񶼿��Է���
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
        while (true) {//ѭ�����з���
            System.out.println("������Ҫ����Ľ��̺ţ�0--4����");
            requestNum = s.nextInt();
            System.out.print("�������������Դ��Ŀ");
            for (int i = 0; i < bank.sourceNum; i++) {
                System.out.println(source[i] + "��Դ����Ŀ��");
                request[i] = s.nextInt();
            }
            bank.change(requestNum, request);
            System.out.println("�Ƿ����������(y/n)");
            choice = s.next();
            if (choice.equals("n")) break;
        }
    }
}
