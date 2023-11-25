
package com.appp.helper;
import java.sql.*;
public class connectionProvider {
    private static Connection con;
    public static Connection getConnection()
    {
        try
        {
            if(con==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Application011","root","D889932s");
            
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }   
}
