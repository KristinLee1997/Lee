package JavaSE.Train;

import java.sql.*;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2017/12/25 19:48
 * @desc
 **/
public class JDBC {
    public static void select() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "root");
//        Statement state = conn.createStatement();
//        ResultSet rs = state.executeQuery("select * from student");
        PreparedStatement ps = conn.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getObject(1) + "\t");
            System.out.print(rs.getObject(2) + "\t");
            System.out.print(rs.getObject(3) + "\t");
            System.out.print(rs.getObject(4) + "\t");
            System.out.println(rs.getObject(5));
        }
        rs.close();
//        state.close();
        conn.close();
    }

    public static void main(String[] args) {
        try {
            JDBC.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
