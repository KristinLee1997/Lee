package JavaSE.TestAPI.Lee.OtherAPI;

import java.util.Calendar;

/**
 * Created by Administrator on 2017/5/29.
 * -------将标准日期模式转变为自定义模式--------
 */
public class Demo3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        String week = getCnWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year + "年" + month + "月" + day + "日" + week);
    }

    public static String getCnWeek(int week) {
        String[] num = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return num[week];
    }
}
