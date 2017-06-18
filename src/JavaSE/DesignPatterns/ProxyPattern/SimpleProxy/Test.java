package JavaSE.DesignPatterns.ProxyPattern.SimpleProxy;

import JavaSE.DesignPatterns.ProxyPattern.SimpleProxy.ProxySubject;

/**
 * Created by Administrator on 2017/6/17.
 * -----------------����ģʽ------------------
 * Subject(���������ɫ):��ʵ�������������Ĺ�ͬ�ӿ�
 * RealSubject(��ʵ�����ɫ):�����˴����ɫ���������ʵ����
 * Proxy(���������ɫ)�����ж���ʵ�����ɫ�����ã������ɫͨ���ڽ��ͻ��˵��ô��ݸ���ʵ�������֮ǰ
 * ����֮��ִ��ĳЩ�����������ǵ���������ʵ�Ķ���
 */
public class Test {
    public static void main(String[] args) {
        //RealSubject realsubject=new RealSubject();
        //realsubject.sellbook();

        ProxySubject proxySubject = new ProxySubject();
        //proxySubject.setRealSubject(realsubject);
        proxySubject.sellbook();
    }
}
