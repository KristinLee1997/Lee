package JavaSE.JDBC;

import java.sql.*;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.ע������
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //2.��������
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bz","root","root");

        //3.���ִ��SQL����
        Statement st=conn.createStatement();

        //4.ִ��SQL���
        ResultSet rs=st.executeQuery("select * from orders");

        //5.����SQL���
        while(rs.next()){
            System.out.print(rs.getObject(1)+"\t");
            System.out.print(rs.getObject(2)+"\t");
            System.out.print(rs.getObject(3));
            System.out.println();
        }

        //6.�ر���Դ
        rs.close();
        st.close();
        conn.close();
    }
}
