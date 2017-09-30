package JavaSE.JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/25.
 */
public class JDBC2 {
    @Test
    public void test() throws Exception {
        //一.加载驱动
        Class.forName("com.mysql.jdbc.Driver");//利用反射，降低耦合

        //二.获取连接Connection

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bz", "root", "root");

        //三.得到执行SQL语句的对象Statement
        Statement sm = conn.createStatement();

        //四.执行SQL语句并返回结果
        ResultSet rs = sm.executeQuery("select * from table1");
        List<Table1> list = new ArrayList<Table1>();

        //五.处理结果
        while (rs.next()) {
            Table1 t=new Table1();
            t.setTab1_id(rs.getInt("tab1_id"));
            t.setTab1_name(rs.getString("tab1_name"));
            list.add(t);
        }

        for(Table1 tab:list){
            System.out.println(tab);
        }

        //六.关闭资源
        rs.close();
        sm.close();
        conn.close();
    }
}
