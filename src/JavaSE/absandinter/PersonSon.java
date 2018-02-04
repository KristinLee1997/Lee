package JavaSE.absandinter;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/31 9:23
 * @desc
 **/
public class PersonSon extends Person {
    private String name;
    private int age;
    private int total;

    PersonSon(String name, int age, int total) {
        super(name, age);
        this.total = total;
    }

    @Override
    public void say() {
        System.out.println("this is son say");
    }

    public static void main(String[] args) {
        PersonSon pp=new PersonSon("tutu",12,22);
        pp.say();
        pp.talk();
    }
}
