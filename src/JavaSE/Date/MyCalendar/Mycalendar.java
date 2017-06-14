package JavaSE.Date.MyCalendar;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Mycalendar {
    public static void main(String[] args) {
        //今天是哪天？然后确定今天是哪个月。
        Date date = new Date(2017 - 1900, 5 - 1, 28);

        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");

        //本月的第一天是星期几----x。
        int firstDay = new Date(date.getYear(), date.getMonth(), 1).getDay();
        //先输出x*2，这么多的\t
        for (int i = 0; i < firstDay; i++) {
            System.out.print("\t\t");
        }
        //本月一共有多少天。
        int days = new Date(date.getYear(), date.getMonth() + 1, 1 - 1).getDate();
        //今天是本月的第几天。
        int today = date.getDate();

        //每七天换一下行。
        int count = firstDay;

        //遍历。开始打印日历。注意，今天要特殊处理。加一个“ * ”,

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
