package JavaSE.Socket.File;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Administrator on 2017/6/22.
 */
public class ServerSend {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);
        File file = new File("E:\\Computer_Science\\wallpaper");
        byte[] buffer = new byte[1024];

    }
}
