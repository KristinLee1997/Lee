package JavaSE.DesignPatterns.ObserverPattern.ObserberApplication;


/**
 * Created by Administrator on 2017/6/17.
 */
public class Test {
    public static void main(String[] args) {
        BlogUser user = new BlogUser();
        user.addObserver(new MyObserver());
        user.publishBlog("����������", "��Ҷ�������");
    }
}
