package JavaSE.String;

/**
 * Created by Administrator on 2017/5/17.
 * 1.�ַ������Ǳ���
 * 2.�ַ���һ�����������Ͳ��ܸ���
 * 3.String�Ĺ��캯�����Խ��ַ��������ַ�����ת���ַ���
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";      //���ܸ���ֻ����"abc"���ܱ�����
        str1 = "gh";           //��ʱ���Ǹ���str1������ʹstr1ָ����"gh"�������
        System.out.println(str1);

        String str2 = "rrr";//�������ָ������ͬһ�ַ���
        String str3 = "rrr";
        System.out.println(str2 == str3);  //true

        //��������������ͬ��ָ��ͬ
        String str4 = "nnn";//�ڳ������д�����һ������
        String str5 = new String("nnn");//���������������ڶ��д�����һ�����󣬲��ѳ������ж���ĵ�ַ���������൱�ڴ�������������
        System.out.println(str4 == str5);      //false
        System.out.println(str4.equals(str5));     //true
        /*Object����equals�����ǱȽϵ�ַ������String��д��equals�����������������ʱ�Ƚϵ���ֵ*/
        String str6 = "abcdefgh";
        String str7 = str6.replace("abd", "def");//replace()���滻ʱ�����û���ҵ�Ҫ�滻�Ĵ����򷵻�ԭ��
        System.out.println(str7);

        String str8 = "l1,l2,l3,l4";
        String[] str9 = str8.split(",");
        for (String i : str9) {
            System.out.println(i);
        }
        System.out.println(str9.length);

        String str10 = "abcd";
        String str11 = "abde";
        System.out.println(str10.compareTo(str11));
    }
}
