package JavaSE.JDBC.Login.Client;


import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*根据用户名和密码获得用户信息*/
public class Dologin {
    @Test
    public User findUser(String username, String password) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        User u = null;
        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from user where username='" + username + "' and password='" + password + "'");
            if (rs.next()) {
                u = new User();
                u.setUsername(rs.getString(1));
                u.setPassword(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs, st, conn);
        }
        return u;
    }
}
