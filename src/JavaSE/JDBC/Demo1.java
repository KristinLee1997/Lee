package JavaSE.JDBC;

import java.sql.*;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //2.建立连接
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bz","root","root");

        //3.获得执行SQL对象
        Statement st=conn.createStatement();

        //4.执行SQL语句
        ResultSet rs=st.executeQuery("select * from orders");

        //5.处理SQL语句
        while(rs.next()){
            System.out.print(rs.getObject(1)+"\t");
            System.out.print(rs.getObject(2)+"\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        //6.关闭资源
        rs.close();
        st.close();
        conn.close();
    }
}
