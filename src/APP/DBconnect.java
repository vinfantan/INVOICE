/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.io.*;
import static java.lang.Character.UnicodeScript.forName;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VIVEK
 */
public class DBconnect {
    public static Connection connect()
    {
         Information info=new Information();
         
         Connection con=null;
          try {
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("driver loaded");
               con=(Connection) DriverManager.getConnection(info.getinfo(0), info.getinfo(1), info.getinfo(2));
               System.out.println("Connection established");          
               return con;
           } catch (ClassNotFoundException ex) {
               System.out.println("driver not loaded");
                return con;
           }
           catch (SQLException ex) {
            System.out.println("Connection not established");
           return (Connection) con;
           }
    }
}

    
  