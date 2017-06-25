package JavaSE.Socket.Interaction;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("����� ���С�����");

        Scanner scan = new Scanner(System.in);

        ServerSocket ss = new ServerSocket(10009);
        while (true) {
            Socket s = ss.accept();

            System.out.println(s.getInetAddress().getHostAddress() + "�����ˡ�������");

            InputStream inputStream = s.getInputStream();

            OutputStream outputStream = s.getOutputStream();

            while (true) {
                byte[] buffer = new byte[1000];
                int n = -1;
                n = inputStream.read(buffer);
                String rec = new String(buffer, 0, n);
                if (rec.equals("over")) {
                    System.out.println("bye");
                    break;
                }
                System.out.println(rec);

                System.out.println("���ճɹ��������룺");
                String msg = scan.nextLine();
                outputStream.write(msg.getBytes());
                if (msg.equals("over")) {
                    System.out.println("bye");
                    break;
                }
            }
        }
    }
}
