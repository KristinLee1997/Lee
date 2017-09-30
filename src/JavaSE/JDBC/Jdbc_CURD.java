package JavaSE.JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Jdbc_CURD {
    @Test
    public void test_update() throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //获得执行Sql的对象Statement
        Statement st = con.createStatement();

        //执行SQL
        int i = st.executeUpdate("update table1 set tab1_name=\"test\" where tab1_id=2");
        System.out.println("更改了" + i + "行");

        //关闭资源
        st.close();
        con.close();

    }

    @Test
    public void test_delete() throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //获得执行Sql的对象Statement
        Statement st = con.createStatement();

        //执行SQL
        int i = st.executeUpdate("delete from table1 where tab1_id=2;");
        System.out.println("删除了" + i + "行");

        //关闭资源
        st.close();
        con.close();


    }
}
