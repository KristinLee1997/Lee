package JavaSE.Date.MyCalendar;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Mycalendar {
    public static void main(String[] args) {
        //���������죿Ȼ��ȷ���������ĸ��¡�
        Date date = new Date(2017 - 1900, 5 - 1, 28);

        System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");

        //���µĵ�һ�������ڼ�----x��
        int firstDay = new Date(date.getYear(), date.getMonth(), 1).getDay();
        //�����x*2����ô���\t
        for (int i = 0; i < firstDay; i++) {
            System.out.print("\t\t");
        }
        //����һ���ж����졣
        int days = new Date(date.getYear(), date.getMonth() + 1, 1 - 1).getDate();
        //�����Ǳ��µĵڼ��졣
        int today = date.getDate();

        //ÿ���컻һ���С�
        int count = firstDay;

        //��������ʼ��ӡ������ע�⣬����Ҫ���⴦����һ���� * ��,

        for (int i = 1; i <= days; i++) {
            if (i == today) System.out.print(i + "*\t\t");
            else System.out.print(i + "\t\t");
            count++;
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }
    }
}
