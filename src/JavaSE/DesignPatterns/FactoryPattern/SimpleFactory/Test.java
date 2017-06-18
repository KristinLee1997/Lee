package JavaSE.DesignPatterns.FactoryPattern.SimpleFactory;

/**
 * Created by Administrator on 2017/6/9.
 * -------------简单工厂模式----------------
 * 工厂角色(Creater):简单工厂模式的核心，负责创建所有实例的内部逻辑，工厂类可以被外界直接调用，创建所需要的产品对象
 * 抽象角色(Product):简单工厂模式所创建的所有实例的父类，负责描述所有实例共有的公共接口
 * 具体产品(Concret Product):简单工厂模式所创建的具体实例对象
 *
 * 简单工厂模式缺点：工厂类集中了所有实例的逻辑创建，当不断有新的类加入时，需要不停的改动工厂类，“高内聚”方面做得不好
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
