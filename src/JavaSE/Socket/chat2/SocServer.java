package JavaSE.Socket.chat2;

/**
 * Created by Administrator on 2017/6/18.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("server is started");
        ServerSocket server = new ServerSocket(4444);
        System.out.println("server is waiting for client");
        Socket socket = server.accept();
        System.out.println("the client responses");
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
