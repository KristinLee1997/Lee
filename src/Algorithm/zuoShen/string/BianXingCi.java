package Algorithm.zuoShen.string;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/12 0:30
 * Goal:���������ַ���str1��str2,���str1��str2���ֵ��ַ�����һ����ÿ���ַ����ֵĴ���Ҳһ��,��ôstr1,str2��Ϊ���δ�.
 * ��ʵ�ֺ����ж������ַ����Ƿ�Ϊ���δ�
 **/
public class BianXingCi {
    public boolean is_bian(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < s1.length; i++) {
            map[s1[i]]++;
        }
        for (int i = 0; i < s2.length; i++) {
            if (map[s2[i]] == 0) {
                return false;
            }
            map[s2[i]]--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="123";
        String str2="3212";
        System.out.println(new BianXingCi().is_bian(str1,str2));
    }
}
