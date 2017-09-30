package Algorithm.zuoShen.string;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/12 0:45
 * Goal:����һ���ַ���str,������ȫ�����ִ������������֮��
 * --����С�����ַ�,����"A1.3",���а�����������1,3
 * --������������Ӵ����������ַ�'-',���������ֵ�����Ϊ����ʱ,��������Ϊ��;�������ֵ�����Ϊż��ʱ,��������Ϊ����.
 * ����,"A-1BC--12",���а�������-1��12
 **/
public class SubStringSum {
    public int sum(String s) {
        if (s == null) {
            return 0;
        }
        char[] str = s.toCharArray();
        int sum = 0;
        int num = 0;
        boolean flag = true;
        int cur = 0;
        for (int i = 0; i < str.length; i++) {
            cur = str[i] - '0';
            if (num < 0 || num > 9) {
                sum += num;
                num = 0;
                if (str[i] == '-') {
                    if (i - 1 > -1 && str[i - 1] == '-') {
                        flag = !flag;
                    } else {
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            } else {
                num = num * 10 + (flag ? cur : -cur);
            }
        }
        sum += num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SubStringSum().sum("123abc12d"));
    }
}
