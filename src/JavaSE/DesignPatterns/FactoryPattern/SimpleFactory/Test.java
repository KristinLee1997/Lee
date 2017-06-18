package JavaSE.DesignPatterns.FactoryPattern.SimpleFactory;

/**
 * Created by Administrator on 2017/6/9.
 * -------------�򵥹���ģʽ----------------
 * ������ɫ(Creater):�򵥹���ģʽ�ĺ��ģ����𴴽�����ʵ�����ڲ��߼�����������Ա����ֱ�ӵ��ã���������Ҫ�Ĳ�Ʒ����
 * �����ɫ(Product):�򵥹���ģʽ������������ʵ���ĸ��࣬������������ʵ�����еĹ����ӿ�
 * �����Ʒ(Concret Product):�򵥹���ģʽ�������ľ���ʵ������
 *
 * �򵥹���ģʽȱ�㣺�����༯��������ʵ�����߼����������������µ������ʱ����Ҫ��ͣ�ĸĶ������࣬�����ھۡ��������ò���
 */
public class Test {
    public static void main(String[] args) {
//        Fruit apple =new Apple();
//        Fruit banana=new Banana();
//        apple.get();
//        banana.get();

        /*one test*/
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();

        /*two test*/
//        try {
//            Fruit apple = FruitFactory.getFruit("apple");
//            Fruit banana = FruitFactory.getFruit("banana");
//            apple.get();
//            banana.get();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
         /*three test*/
        try {
            Fruit apple = FruitFactory.getFruit("JavaSE.DesignPatterns.FactoryPattern.SimpleFactory.Apple");
            Fruit banana = FruitFactory.getFruit("JavaSE.DesignPatterns.FactoryPattern.SimpleFactory.Banana");
            apple.get();
            banana.get();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
