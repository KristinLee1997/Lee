package JavaSE.JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC3 {
    @Test
    public void test() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bz","root","root");

        Statement st=conn.createStatement();

        ResultSet rs=st.executeQuery("select * from orders");

        while(rs.next()){
            System.out.print(rs.getObject(1)+"\t");
            System.out.print(rs.getObject(2)+"\t");
            System.out.print(rs.getObject(3)+"\t");
            System.out.println();
        }
        if(rs!=null){
            rs.close();
        }
        if(st!=null){
            st.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}
