package JavaSE.DesignPatterns.ObserverPattern.ObserberApplication;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Article {
    private String articleTitle;
    private String articleContent;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
