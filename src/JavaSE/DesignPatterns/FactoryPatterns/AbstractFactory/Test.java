package JavaSE.DesignPatterns.FactoryPatterns.AbstractFactory;

/**
 * Created by Administrator on 2017/6/10.
 * --------------抽象工厂模式-----------------
 * 抽象工厂角色(Creator)：抽象模式的核心，包含对多个产品结构的说明，任何工厂类都必须实现这个接口
 * 具体工厂角色(Concrete Creator):具体工厂类是抽象工厂的一个实现，负责实例化某个产品族中的产品对象
 * 抽象角色(Product):抽象模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口
 * 具体产品(Concrete Product)：抽象模式所创建的具体实例对象
 */
public class Test {
    public static void main(String[] args) {
        Factory north = new NorthFactory();
        north.getApple().get();
        north.getBanana().get();
        Factory south = new SouthFactory();
        south.getApple().get();
        south.getBanana().get();
    }
}
