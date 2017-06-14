package Train;

/**
 * Created by Administrator on 2017/5/5.
 * 多态
 */
/*多态*/
public class TestPolymorphism {
    public static void main(String[] args) {
        TestPolymorphism p = new TestPolymorphism();
        Animal a = new Dog();//多态的体现：父类的引用或者接口指向了自己的子类
        Animal b = new Cat();//向上转型
        p.method(a);
        p.method(b);
    }

    public static void method(Animal a) {
        /*优点：提高了程序的扩展性
            缺点：但是父类引用操作子类对象时，只能引用父类已有的方法，而不能引用子类特有的方法*/
        a.eat();
        if (a instanceof Dog) {
            Dog x = (Dog) a;
            x.lookhome();
        } else if (a instanceof Cat) {
            Cat y = (Cat) a;//向下转型
            y.catchMouse();//调用子类特有的方法
        }
    }
    /*多态前提：必须具有关系，如继承或实现
				一般有重写操作
	*/
}


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("骨头");
    }

    public void lookhome() {
        System.out.println("看家");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("fish");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}