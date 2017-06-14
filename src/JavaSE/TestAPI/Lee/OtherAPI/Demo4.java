package JavaSE.TestAPI.Lee.OtherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/29.
 */
public class Demo4 {
    public static void main(String[] args) {
        String str = "2017-05-29";
        try {
            Date date = DateFormat.getDateInstance().parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String str2 = "2017/05/29";
        DateFormat date2 = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date print = date2.parse(str2);
            System.out.println(print);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
