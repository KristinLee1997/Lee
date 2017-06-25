package JavaSE.Socket.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/22.
 * ---------�ͻ����������������Ϣ------------
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 4444);
        System.out.println("�ͻ���׼������");
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(client.getOutputStream()), true);
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            pw.println(scan.nextLine());
        }
        scan.close();
        pw.close();
        client.close();
    }
}
