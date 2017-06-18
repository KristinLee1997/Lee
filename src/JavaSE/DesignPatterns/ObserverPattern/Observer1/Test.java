package JavaSE.DesignPatterns.ObserverPattern.Observer1;

/**
 * Created by Administrator on 2017/6/17.
 * ------------- 观察者模式---------------
 * Subject(被观察者):当需要被观察的状态发生变化时，需要通知队列中所有观察者对象。Subject需要维持(添加，删除，通知)一个观察者对象的队列列表
 * ConcreteSubject:被观察者的具体实现。包含一些基本的属性状态及其他操作
 * ObserverPattern(观察者):接口或抽象类。当Subject的状态发生变化时，Observer对象将通过一个callback的函数得到通知
 * ConcreteObserver:观察者的具体实现。得到通知后将完成一些具体的业务逻辑处理。
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        MyObserver my = new MyObserver();
        person.addObserver(new MyObserver());
        person.addObserver(my);
        person.deleteObserver(my);
        person.setName("lihang");
        person.setSex("girl");
        person.setAge(20);
    }
}
