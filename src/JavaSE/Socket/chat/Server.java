package JavaSE.Socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/22.
 * -----------服务器------------
 * -------------客户端向服务器发送消息---------------
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(4444);
        System.out.println("服务器准备好啦");

        Socket socket = server.accept();
        System.out.println("服务器连接成功");

        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        boolean flag = true;
        while (flag) {
            String msg = bf.readLine();
            if (msg.toLowerCase().equals("exit")) {
                flag = false;
                System.out.println("over");
            }
            System.out.printf("%s\n", msg);
        }

        bf.close();
        socket.close();
        server.close();
    }
}
