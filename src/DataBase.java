
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DataBase {
    Connection conn = null;
    public static Connection DbConnect() throws SQLException{
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:TailorShopManagementSystem.db");
            //JOptionPane.ShowMessageDialog(null, "DataBase Connected");
            return conn;
        } Catch (ClassNotFoundException e) {
            JOptionPane.ShowMessageDialog(null, e);
            return null;
        }
    }
}
