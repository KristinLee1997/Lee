package JavaSE.DesignPatterns.ObserverPattern.ObserberApplication;

import java.util.Observable;

/**
 * Created by Administrator on 2017/6/17.
 */
public class BlogUser extends Observable {
    public void publishBlog(String articleTitle, String articleContent) {
        Article art = new Article();
        art.setArticleTitle("博客上线了");
        art.setArticleContent("大家多来访问");
        System.out.println("被观察者---博主：发表新文章，文章标题" + articleTitle + "，文章内容：" + articleContent);
        this.setChanged();
        this.notifyObservers(art);
    }
}
