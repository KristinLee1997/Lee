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
        System.out.println("观察者--博主发表新文章");
        System.out.println("博客标题为：" + art.getArticleTitle());
        System.out.println("博客内容为：" + art.getArticleContent());
    }
}
