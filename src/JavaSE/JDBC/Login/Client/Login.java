package JavaSE.JDBC.Login.Client;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input username:");
        String username = scan.nextLine();
        System.out.println("Please input password:");
        String password = scan.nextLine();
        Dologin dl=new Dologin();
        User u=dl.findUser(username,password);
        if(u!=null){
            System.out.println("欢迎您:"+u.getUsername());
        }
        else{
            System.out.println("用户名或密码不存在");
        }
    }
}
