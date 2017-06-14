package JavaSE.String;

/**
 * Created by Administrator on 2017/5/17.
 * 1.字符串都是变量
 * 2.字符串一旦被创建，就不能更改
 * 3.String的构造函数可以将字符串或者字符数组转成字符串
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";      //不能更改只的是"abc"不能被更改
        str1 = "gh";           //这时不是更改str1，而是使str1指向了"gh"这个对象
        System.out.println(str1);

        String str2 = "rrr";//多个对象指向常量池同一字符串
        String str3 = "rrr";
        System.out.println(str2 == str3);  //true

        //两个对象内容相同，指向不同
        String str4 = "nnn";//在常量池中创建了一个对象
        String str5 = new String("nnn");//创建了两个对象（在堆中创建了一个对象，并把常量池中对象的地址赋给对象，相当于创建了两个对象）
        System.out.println(str4 == str5);      //false
        System.out.println(str4.equals(str5));     //true
        /*Object类中equals方法是比较地址，但是String重写了equals方法，所以上面调用时比较的是值*/
        String str6 = "abcdefgh";
        String str7 = str6.replace("abd", "def");//replace()做替换时，如果没有找到要替换的串，则返回原串
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
