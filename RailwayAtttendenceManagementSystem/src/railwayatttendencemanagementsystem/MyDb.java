/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayatttendencemanagementsystem;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROHANRAJ
 */
public class MyDb {
    java.sql.Connection con = null;
    java.sql.Statement st = null;
    java.sql.ResultSet result = null;
    
    public MyDb()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pamsystem","root","root");
                st = con.createStatement();
                //st.executeQuery("SELECT * FROM cp12155 where coachno = '"+var+"'");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    
    
}
