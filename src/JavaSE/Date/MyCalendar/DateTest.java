package JavaSE.Date.MyCalendar;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/28.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2017 - 1900, 5 - 1, 28);
        int firstDay = new Date(2017 - 1900, 4, 1).getDay();
        System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("\t\t");
        }
        int dayMonth = new Date(2017 - 1900, 5, 0).getDate();
        int count = firstDay;
        for (int i = 1; i <= dayMonth; i++) {
            if (i == date.getDate()) {
                System.out.print(i + "*\t\t");
            } else {
                System.out.print(i + "\t\t");
            }
            count++;
            if (count % 7 == 0) {
                System.out.println();
            }
        }
    }
}
