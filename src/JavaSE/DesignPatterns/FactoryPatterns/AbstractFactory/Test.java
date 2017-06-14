package JavaSE.DesignPatterns.FactoryPatterns.AbstractFactory;

/**
 * Created by Administrator on 2017/6/10.
 * --------------���󹤳�ģʽ-----------------
 * ���󹤳���ɫ(Creator)������ģʽ�ĺ��ģ������Զ����Ʒ�ṹ��˵�����κι����඼����ʵ������ӿ�
 * ���幤����ɫ(Concrete Creator):���幤�����ǳ��󹤳���һ��ʵ�֣�����ʵ����ĳ����Ʒ���еĲ�Ʒ����
 * �����ɫ(Product):����ģʽ�����������ж���ĸ��࣬��������������ʵ�������еĹ����ӿ�
 * �����Ʒ(Concrete Product)������ģʽ�������ľ���ʵ������
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
