/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladmin;

import java.sql.SQLException;

/**
 *
 * @author Primm
 */
public class HospitalAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        patient p1= new patient("Oglobe","25/03/2023","A+");
        patient p2= new patient("Vernon","26/03/2023","O+");
        // to get patient ID 
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        // TODO code application logic here
        
        System.out.println(patient.getCurrentID());
        if (DatabaseSetup.setupDB()){
            System.out.println("Data table created, you are a STAR Primmy");
            
        }else{
            System.out.println("ohh no, something is wrong with your database");
        }
    }
    
}
