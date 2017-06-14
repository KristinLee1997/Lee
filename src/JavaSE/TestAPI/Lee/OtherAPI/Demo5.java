package JavaSE.TestAPI.Lee.OtherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/29.
 * ----------获取两个日期相差的天数----------
 */
public class Demo5 {
    public static void main(String[] args) {
        String str1 = "2017-04-28";
        String str2 = "2017年05月28日";
        int style_1 = DateFormat.MEDIUM;
        int style_2 = DateFormat.LONG;
        long day = getDay(str1, str2, style_1, style_2);
        System.out.println(day);
    }

    public static long getDay(String str1, String str2, int style_1, int style_2) {
        DateFormat date1 = DateFormat.getDateInstance(style_1);
        DateFormat date2 = DateFormat.getDateInstance(style_2);
        try {
            Date s1 = date1.parse(str1);
            Date s2 = date2.parse(str2);
            long time = Math.abs(s1.getTime() - s2.getTime());
            return time / 1000 / 60 / 60 / 24;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
