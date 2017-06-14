package JavaSE.String;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/19.
 */
public class SystemTest {
    public static void main(String[] args) {
        InputStream is = System.in;
        boolean flag = true;
        byte[] buffer = new byte[1024];
        int n = 0;
        try {
            while ((n = is.read(buffer)) != -1) {
                {
                    System.out.println(new String(buffer).trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}