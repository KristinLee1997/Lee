package Train;

import java.awt.*;
import java.net.URI;

/**
 * Created by Administrator on 2017/5/19.
 * -------���������ָ����ҳ-----------
 */
public class TestOpenWeb {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.baidu.com");
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
