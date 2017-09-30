package JavaSE.JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by Administrator on 2017/7/25.
 */
public class JDBC1 {
    @Test
    public void test() throws Exception {
        /*一.注册驱动：注册驱动两次，强烈依赖jar包，所以不建议使用
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        */

        //一.加载驱动
        Class.forName("com.mysql.jdbc.Driver");//利用反射，降低耦合

        /*二.获取连接Connection
        URL--协议：子协议：//IP:端口号/DB名
        mysql连接本机URL："jdbc:mysql:///bz"*/
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //三.得到执行SQL语句的对象Statement
        Statement sm = conn.createStatement();

        //四.执行SQL语句并返回结果
        ResultSet rs = sm.executeQuery("select * from orders");

        //五.处理结果
        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        //六.关闭资源
        rs.close();
        sm.close();
        conn.close();
    }

    @Test
    public void test2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Properties info =new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", info);

        Statement sm = conn.createStatement();

        ResultSet rs = sm.executeQuery("select * from orders");

        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        rs.close();
        sm.close();
        conn.close();

    }

    @Test
    public void test3() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz?user=root&password=root");

        Statement sm = conn.createStatement();

        ResultSet rs = sm.executeQuery("select * from orders");

        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        rs.close();
        sm.close();
        conn.close();

    }
}