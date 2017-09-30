package JavaSE.JDBC.Login.Client;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtils {
    private static String driverClass;
    private static String url;
    private static String user;
    private static String password;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
        driverClass = rb.getString("driverClass");
        url = rb.getString("url");
        user = rb.getString("user");
        password = rb.getString("password");
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeAll(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
