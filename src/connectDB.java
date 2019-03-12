

import java.sql.*;
import javax.swing.JOptionPane;

public class connectDB
{
     Connection conn=null;
    
    public static Connection connDB()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/expensemanager","root","");
                    
            return conn;
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
