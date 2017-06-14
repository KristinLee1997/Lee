package Train;

/**
 * Created by Administrator on 2017/5/5.
 * ��̬
 */
/*��̬*/
public class TestPolymorphism {
    public static void main(String[] args) {
        TestPolymorphism p = new TestPolymorphism();
        Animal a = new Dog();//��̬�����֣���������û��߽ӿ�ָ�����Լ�������
        Animal b = new Cat();//����ת��
        p.method(a);
        p.method(b);
    }

    public static void method(Animal a) {
        /*�ŵ㣺����˳������չ��
            ȱ�㣺���Ǹ������ò����������ʱ��ֻ�����ø������еķ����������������������еķ���*/
        a.eat();
        if (a instanceof Dog) {
            Dog x = (Dog) a;
            x.lookhome();
        } else if (a instanceof Cat) {
            Cat y = (Cat) a;//����ת��
            y.catchMouse();//�����������еķ���
        }
    }
    /*��̬ǰ�᣺������й�ϵ����̳л�ʵ��
				һ������д����
	*/
}


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("��ͷ");
    }

    public void lookhome() {
        System.out.println("����");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("fish");
    }

    public void catchMouse() {
        System.out.println("ץ����");
    }
}