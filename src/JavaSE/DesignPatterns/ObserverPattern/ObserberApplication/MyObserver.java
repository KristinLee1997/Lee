package JavaSE.DesignPatterns.ObserverPattern.ObserberApplication;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/6/17.
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Article art = (Article) arg;
        System.out.println("�۲���--��������������");
        System.out.println("���ͱ���Ϊ��" + art.getArticleTitle());
        System.out.println("��������Ϊ��" + art.getArticleContent());
    }
}
