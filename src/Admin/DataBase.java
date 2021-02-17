package Admin;

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
            //JOptionPane.showMessageDialog(null, "DataBase Connected");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

