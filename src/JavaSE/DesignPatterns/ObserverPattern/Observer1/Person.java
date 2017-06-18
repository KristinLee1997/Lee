package JavaSE.DesignPatterns.ObserverPattern.Observer1;

import java.util.Observable;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Person extends Observable {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();  //���øı�
        this.notifyObservers(); //֪ͨ�۲��ߣ����۲��߷����ı�
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        this.setChanged();
        this.notifyObservers();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.setChanged();
        this.notifyObservers();
    }
}
