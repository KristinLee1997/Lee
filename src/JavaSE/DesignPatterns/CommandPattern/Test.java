package JavaSE.DesignPatterns.CommandPattern;

/**
 * Created by Administrator on 2017/6/15.
 * -----------命令模式--------------
 * Command:Command抽象类
 * ConcreteCommand:Command的具体实现类
 * Receiver：需要被调用的·目标对象
 * Invorker：通过Invorker执行Command对象
 */
public class Test {
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
//         peddler.sallApple();
//         peddler.sallBanana();

        Command applecommand = new AppleCommand(peddler);
        Command bananacommand = new BananaCommand(peddler);
//        applecommand.sall();
//        bananacommand.sall();

//        Waiter waiter=new Waiter();
//        waiter.setCommand(applecommand);
//        waiter.sall();
//        waiter.setCommand(bananacommand);
//        waiter.sall();

        Waiter waiter = new Waiter();
        waiter.setOrder(applecommand);
        waiter.setOrder(bananacommand);
        waiter.removeOrder(applecommand);
        waiter.sall();

    }
}
