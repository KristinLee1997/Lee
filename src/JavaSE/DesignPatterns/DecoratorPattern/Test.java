package JavaSE.DesignPatterns.DecoratorPattern;

/**
 * Created by Administrator on 2017/6/15.
 * -------------װ����ģʽ---------------
 * ���������ɫ��һ������ӿڣ��Ǳ�װ�����װ����ĸ��ӿ�
 * ���������ɫ��Ϊ���������ʵ����
 * ����װ�ν�ɫ������һ����������ã�����������������һ�µĽӿ�
 * ����װ�ν�ɫ��Ϊ����װ�ν�ɫ��ʵ���࣬��������װ��
 */
public class Test {
    public static void main(String[] args) {
        Car car = new RunCar();
        //car.show();
        Car swimCar = new SwimCarDecorator(car);
        //swimCar.show();
        Car flySwimCar = new FlyCarDecorator(swimCar);
        flySwimCar.show();
    }
}
