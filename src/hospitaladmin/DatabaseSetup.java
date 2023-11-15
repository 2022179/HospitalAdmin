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
public class DatabaseSetup {
   final String DB_BASE_URL = "jdbc:mysql://localhost";
    //jdbc=java database connector
    final String USER ="ooc2023";
    final String PASSWORD = "OOC2023";
    // THIS WILL ALWAY SHOW WHEN CONNECTING DATABASE 
    public boolean setupDB() throws SQLException{
        try(
            Connection conn= DriverManager.getConnection( DB_BASE_URL,USER,PASSWORD);
            Statement stmt = conn.createStatement();
            
            ){
                stmt.execute("CREATE DATABASE IF NOT EXIST'hospital';");
                stmt.execute("USER 'hospital';");
                String sql=
                        "CREATE DATABASE IF NOT EXIST'patientData'("
                        +"'name ' VARCHAR(255),"
                        +"birthdate'DATE'"
                        +"'bloodtype ' VARCHAR(2),"
                        +"'id' INT(10)"
                        //the number are to specify how long it should be
                        ");";
                stmt.execute(sql);
                return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
                
            }
    }
}
}