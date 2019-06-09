/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.se;

import java.sql.*;

/**
 *
 * @author aruna
 */
public class TestJavaSE {

    /**
     * @param args the command line arguments
     */
    private static String URL = "jdbc:mysql://localhost:3306/taxi";
    private static String USER = "root";
    private static String PASS = "password";
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(URL,USER,PASS);
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from driver_login");  
            while(rs.next()) {
                System.out.println(rs.getInt(1));
            }
            con.close();  
            System.out.println("Finsh");
        } catch(SQLException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
