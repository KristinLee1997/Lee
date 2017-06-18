package JavaSE.DesignPatterns.ObserverPattern.Observer1;

/**
 * Created by Administrator on 2017/6/17.
 * ------------- �۲���ģʽ---------------
 * Subject(���۲���):����Ҫ���۲��״̬�����仯ʱ����Ҫ֪ͨ���������й۲��߶���Subject��Ҫά��(��ӣ�ɾ����֪ͨ)һ���۲��߶���Ķ����б�
 * ConcreteSubject:���۲��ߵľ���ʵ�֡�����һЩ����������״̬����������
 * ObserverPattern(�۲���):�ӿڻ�����ࡣ��Subject��״̬�����仯ʱ��Observer����ͨ��һ��callback�ĺ����õ�֪ͨ
 * ConcreteObserver:�۲��ߵľ���ʵ�֡��õ�֪ͨ�����һЩ�����ҵ���߼�����
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
