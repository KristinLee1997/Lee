package JavaSE.DesignPatterns.FactoryPattern.SimpleFactory;

/**
 * Created by Administrator on 2017/6/9.
 */
public class FruitFactory {
    /*one FruitFactory*/
//    public static Fruit getApple(){
//        return new Apple();
//    }
//
//    public static  Fruit getBanana(){
//        return new Banana();
//    }
        /*two FruitFactory���ַ���
        * ��ʹ��*/
//    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
//        if (type.equals("apple")) {
//            return Apple.class.newInstance();
//        } else if (type.equals("banana")) {
//            return Banana.class.newInstance();
//        } else {
//            System.out.println("�Ҳ���");
//            return null;
//        }
//    }
        /*three FruitFactory
        * ��չ�Խ�ǿ����Ӧ�Խ���*/
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class c = Class.forName(type);
        return (Fruit) c.newInstance();
    }
}
