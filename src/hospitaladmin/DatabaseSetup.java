/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Primm
 */
public class DatabaseSetup extends Database{
   final static String DB_BASE_URL = "jdbc:mysql://localhost";
    //jdbc=java database connector
    final static String USER ="ooc2023";
    final static String PASSWORD = "ooc2023";
    // THIS WILL ALWAY SHOW WHEN CONNECTING DATABASE 
    public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try(
            Connection conn= DriverManager.getConnection( DB_BASE_URL,USER,PASSWORD);
            Statement stmt = conn.createStatement();
            
            ){
                stmt.execute("CREATE DATABASE IF NOT EXISTS "+ DB_NAME + ";");
                stmt.execute("USE "+ DB_NAME + ";");
                String sql=//the number are to specify how long it should be
                        "CREATE TABLE IF NOT EXISTS "+ TABLE_NAME +"("
                        + "name VARCHAR(255),"
                        + "birthdate DATE,"
                        + "bloodtype VARCHAR(2),"
                        + "id INT(10)"
                        + ");";
                
                stmt.execute(sql);
                return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
            
                
            }
    }
}
