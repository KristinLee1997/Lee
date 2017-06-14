package Algorithm.Problems;

/**
 * Created by Administrator on 2017/6/13.
 *----------É¾³ýÖØ¸´µÄ×Ö·û--------------
 * */
public class Delstr {
    public static void main(String[] args) {
        String str = "Abdbecd";
        int[] num = new int[130];
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (num[str.charAt(i)] == 0) {
                num[str.charAt(i)] = count;
                count++;
            }
        }
        char[] str2 = new char[100];
        for (int i = 65; i < num.length; i++) {
            if (num[i] != 0) {
                str2[num[i]] = (char) i;
            }
        }
        System.out.println(str2);
    }
}

