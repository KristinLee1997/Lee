package Train;

/**
 * Created by Administrator on 2017/5/7.
 */

import java.awt.*;
import java.awt.event.*;

public class EventQs {
    private Frame f = new Frame("�����¼�");
    private Button ok = new Button("ȷ��");
    private Button quit = new Button("�˳�");
    private TextField tf = new TextField(30);

    public static void main(String[] args) {
        new EventQs().init();
    }

    public void init() {
        //ע���¼�������
        //ok.addActionListener(new OkListener());
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tf.setText("Hello World");
            }
        });
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //�����¼���������
        /*class OkListener implements ActionListener{
            //���涨��ķ��������¼���������������Ӧ�ض����¼�
			public void actionPerformed(ActionEvent e){
				System.out.println("�û�������ok��ť");
				tf.setText("Hello World");
			}
		}*/
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.add(quit, BorderLayout.NORTH);
        f.pack();//���ô���Ϊ��Ѵ�С,�ſ�����
        f.setVisible(true);
    }
}
