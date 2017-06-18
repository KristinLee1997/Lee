package JavaSE.DesignPatterns.ObserverPattern.Observer1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/6/17.
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("instance is changed");
    }
}
