
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vaibhav
 */
public class session {
    Connection connect = connectDB.connDB();  
        Statement stmt=null;
        String name = "";
        int id;
    
        public session()
        {
            connect = connectDB.connDB();  
            try {
                                String sql = "select * from user where state = '1' ";
                                stmt = connect.createStatement();

                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next())
                                {
                                    name = rs.getString("fname");
                                    id= rs.getInt("id");
                                }
            }
      catch (SQLException e) {
                                                        JOptionPane.showMessageDialog(null, e);
            }    
        }
    public String getSession()
    {
    try {
                                String sql = "select * from user where state = '1' ";
                                stmt = connect.createStatement();

                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next())
                                {
                                    name = rs.getString("fname");
                                    id= rs.getInt("id");
                                }
            }
      catch (SQLException e) {
                                                        JOptionPane.showMessageDialog(null, e);
            }    
    return name;
    }    
    
    public int getSessionID()
    {
    try {
                                String sql = "select * from user where state = '1' ";
                                stmt = connect.createStatement();

                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next())
                                {
                                    id= rs.getInt("id");
                                }
            }
      catch (SQLException e) {
                                                        JOptionPane.showMessageDialog(null, e);
            }    
    return id;
    }  
    
    public void setSession(String email)
    {
         try {
                                            String sql = "update user set state =  '0' ";  
                                            String sql1 = "update user set state =  '1' where email = \'"+email+"\'";  
                                            stmt = connect.createStatement();

                                            stmt.executeUpdate(sql);
                                            stmt.executeUpdate(sql1);
                                            
                                             name = email;
                                            
                                            
                                                    } 
                                           catch (SQLException e) {
                                                        JOptionPane.showMessageDialog(null, e);
                                                    } 
                JOptionPane.showMessageDialog(null, "Login Success !");
               
    }
    
    public boolean isSet()
    {
        name = getSession();
       return (name.length()!=0);
        
    }
    
    public void unSet()
    {
       try {
                                            String sql = "update user set state =  '0' ";  
                                            stmt = connect.createStatement();

                                            stmt.executeUpdate(sql);
                                            

                                            name="";
                                            
                                            
                                                    } 
                                           catch (SQLException e) {
                                                        JOptionPane.showMessageDialog(null, e);
                                                    }
    
    
    
}
}
