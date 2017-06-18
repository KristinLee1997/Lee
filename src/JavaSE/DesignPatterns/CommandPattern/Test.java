package JavaSE.DesignPatterns.CommandPattern;

/**
 * Created by Administrator on 2017/6/15.
 * -----------����ģʽ--------------
 * Command:Command������
 * ConcreteCommand:Command�ľ���ʵ����
 * Receiver����Ҫ�����õġ�Ŀ�����
 * Invorker��ͨ��Invorkerִ��Command����
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
