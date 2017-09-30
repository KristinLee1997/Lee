package Algorithm.leetcode;


/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/29 14:33
 * Goal:
 **/
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance h=new HammingDistance();
        System.out.println(h.hamm2(8,6));
    }
    public int hammingDistance(int x, int y) {
        StringBuffer a = new StringBuffer(Integer.toBinaryString(x));
        StringBuffer b = new StringBuffer(Integer.toBinaryString(y));
        int lena = a.length();
        int lenb = b.length();
        int count = 0;
        while (lena > 0 || lenb > 0) {
            if (lena <= 0) {
                if ('0' != b.charAt(lenb - 1)) {
                    count++;
                }
            } else if (lenb <= 0) {
                if (a.charAt(lena - 1) != '0') {
                    count++;
                }
            } else {
                if (a.charAt(lena - 1) != b.charAt(lenb - 1)) {
                    count++;
                }
            }
            lena--;
            lenb--;
        }
        return count;
    }

    public int hamm2(int x,int y){
        return Integer.bitCount(x^y);
    }
}
