package JavaSE.Socket.chat2;

/**
 * Created by Administrator on 2017/6/18.
 */

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SocClient {
    public static void main(String[] args) throws IOException {
        System.out.println("the client is started");
        Socket socket = new Socket("127.0.0.1", 4444);
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            pw.println(scan.nextLine());
        }
        scan.close();
        pw.close();
        socket.close();
    }
}