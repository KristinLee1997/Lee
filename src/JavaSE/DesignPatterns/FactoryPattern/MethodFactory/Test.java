package JavaSE.DesignPatterns.FactoryPattern.MethodFactory;

/**
 * Created by Administrator on 2017/6/10.
 * ---------------��������ģʽ---------------
 *�򵥹���ģʽ�빤������ģʽ��
 * ����������ĺ�����һ�����󹤳��࣬�򵥹���ģʽ�ĺ�����һ��������
 * �����һ���¶���ʱ���򵥹�����Ҫ�Ķ����Ĺ����࣬����������ֻ��Ҫ���һ��������
 */
public class Test {
    public static void main(String[] args) {
        Factory apple=new AppleFactory();
        Factory banana=new BananaFactory();
        apple.getFruit().get();
        banana.getFruit().get();
    }
}
