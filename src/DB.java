
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class DB {
    
    static final String url = "jdbc:mysql://localhost:3306/librarymgmnt";
    static final String user = "root";
    static final String pwd = "root";
    static Connection con;
    static Statement st;
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pwd);
            st =  con.createStatement();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    public static ResultSet executeQuery(String sql) throws SQLException
    {
        return st.executeQuery(sql);
    }
    
    public static int executeUpdate(String sql) throws SQLException
    {
        return st.executeUpdate(sql);
    }
}
