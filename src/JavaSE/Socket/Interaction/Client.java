package JavaSE.Socket.Interaction;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("�ͻ������У�������");

        Socket s = new Socket("127.0.0.1", 10009);

        Scanner scan = new Scanner(System.in);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        while (true) {
            System.out.println("�����룺");
            String msg = scan.nextLine();
            outputStream.write(msg.getBytes());
            if (msg.equals("over")) break;


            byte[] buffer = new byte[1000];
            int n = -1;
            n = inputStream.read(buffer);
            String rec = new String(buffer, 0, n);
            System.out.println(rec);
            if (rec.equals("over")) break;

            System.out.println("���ճɹ�");
        }
    }
}
