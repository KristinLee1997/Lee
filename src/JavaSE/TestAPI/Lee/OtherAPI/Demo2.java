package JavaSE.TestAPI.Lee.OtherAPI;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/28.
 */
public class Demo2 {
    public static void main(String[] args) {
        long mils = System.currentTimeMillis();
        Date date = new Date(mils);
        System.out.println(date.toString());
        String str = DateFormat.getDateInstance(DateFormat.LONG).format(date);
        System.out.println(str);
    }
}
