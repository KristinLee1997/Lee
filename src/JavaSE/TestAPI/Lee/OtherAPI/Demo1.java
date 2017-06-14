package JavaSE.TestAPI.Lee.OtherAPI;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


/**
 * Created by Administrator on 2017/5/28.
 */
public class Demo1 {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        Properties prop = System.getProperties();
//        Set<String> set=prop.stringPropertyNames();
//        Iterator<String> it=set.iterator();
//        while(it.hasNext()){
//            String str=it.next();
//            System.out.println(prop.getProperty(str));
//
//        }
        String osname = System.getProperty("os.name");
        System.out.println(osname);

        System.out.println("dog" + LINE_SEPARATOR + "cat");

    }
}
