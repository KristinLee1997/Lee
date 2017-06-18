package JavaSE.DesignPatterns.ObserverPattern.ObserberApplication;

import java.util.Observable;

/**
 * Created by Administrator on 2017/6/17.
 */
public class BlogUser extends Observable {
    public void publishBlog(String articleTitle, String articleContent) {
        Article art = new Article();
        art.setArticleTitle("����������");
        art.setArticleContent("��Ҷ�������");
        System.out.println("���۲���---���������������£����±���" + articleTitle + "���������ݣ�" + articleContent);
        this.setChanged();
        this.notifyObservers(art);
    }
}
