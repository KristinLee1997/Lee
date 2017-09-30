package Algorithm.leetcode;

/**
 * Created with IntelliJ IDEA 2017.2.3
 * User:   Li Hang
 * Saying: Never give up !!!
 * Date:   2017/9/30 11:11
 * Goal:
 **/
public class JudgeCircle {
    public static void main(String[] args) {
        JudgeCircle j = new JudgeCircle();
        System.out.println(j.judgeCircle("UR"));
    }

    public boolean judgeCircle(String moves) {
        boolean result = false;
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            } else if (moves.charAt(i) == 'R') {
                x--;
            } else if (moves.charAt(i) == 'L') {
                x++;
            }
        }
        return result = (x == 0 && y == 0 ? true : false);
    }
}
