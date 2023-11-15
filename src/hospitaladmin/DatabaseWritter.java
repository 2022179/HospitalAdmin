/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Primm
 */
public class DatabaseWritter extends Database{
     public boolean addpatient(patient patient) throws SQLException{
          try(
            Connection conn= DriverManager.getConnection( DB_URL,USER,PASSWORD);
            Statement stmt = conn.createStatement();
            
            ){
              String sql = String.format("INSERT INTO "+ TABLE_NAME + " VALUES ("
              +"'%s', '%s', '%s',%d);",
              patient.getName(), patient.getBirthdate(),patient.getBloodType(),patient.getPatientID());
              stmt.execute(sql);
              return true;
          
          }catch(Exception e){
            e.printStackTrace();
            return false;
            
              
         
     }
        
    
//    public boolean addAllPatients(List<patient>patientList){
//        return true;
//    }
        
    }
}
