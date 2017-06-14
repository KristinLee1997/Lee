package Train;

/**
 * Created by Administrator on 2017/5/7.
 */

import java.awt.*;
import java.awt.event.*;

public class EventQs {
    private Frame f = new Frame("测试事件");
    private Button ok = new Button("确定");
    private Button quit = new Button("退出");
    private TextField tf = new TextField(30);

    public static void main(String[] args) {
        new EventQs().init();
    }

    public void init() {
        //注册事件监听器
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
        //定义事件监听器类
        /*class OkListener implements ActionListener{
            //下面定义的方法就是事件处理器，用于响应特定的事件
			public void actionPerformed(ActionEvent e){
				System.out.println("用户单击了ok按钮");
				tf.setText("Hello World");
			}
		}*/
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.add(quit, BorderLayout.NORTH);
        f.pack();//设置窗口为最佳大小,张开窗口
        f.setVisible(true);
    }
}
