import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by king on 2017/4/8.
 */
public class MK {
    public static void main(String args[]) {
        ff();
    }

    public static void getArea1() {
        int a = 5;
        int b = 6;
        System.out.println("面积是" + a * b / 2);
    }

    public static void getArea2(int a, int b) {
        System.out.println("面积是" + a * b / 2);
    }

    public static float getArea3(int a, int b) {
        return a * b / 2;
    }

    public static float getArea4() {
        int a = 5;
        int b = 6;
        return a * b / 2;
    }

    public static void f1(int age) {
        if (age > 60) System.out.println("老年");
        else if (age > 40) System.out.println("中年");
        else if (age > 20) System.out.println("青年");
    }

    public static void f2(int age) {
        if (age >= 20 && age < 40) System.out.println("老年");
        else if (age >= 40 && age < 60) System.out.println("中年");
        else if (age > 60) System.out.println("青年");
    }

    public static void run(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("闰年");
        else System.out.println("ping");
    }

    public static void chun(int month) {
        switch (month / 20) {
            case 0: {
                System.out.println("1等");
                break;
            }

            case 1: {
                System.out.println("2等");
                break;
            }
            case 2: {
                System.out.println("3等");
                break;
            }
            case 3: {
                System.out.println("4等");
                break;
            }
            default: {
                System.out.println("5等");
                break;
            }
        }
    }

    public static int add() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void ff() {
        for (int i = 2; i <= 8; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d", i);

            }
            System.out.println();
        }

    }
}
