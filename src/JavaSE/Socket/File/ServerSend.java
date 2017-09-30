package JavaSE.Socket.File;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/22.
 */
public class ServerSend {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);
        Socket client = server.accept();
        File file = new File("E:\\Computer_Science\\wallpaper\\1214903.jpg");
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(file.getName());
        dos.flush();
        byte[] buffer = new byte[1024];
        int n = -1;

    }
}
