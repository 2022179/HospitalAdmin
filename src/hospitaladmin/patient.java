/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladmin;

/**
 *
 * @author Primm
 */
public class patient {
    /*
    Name 
    DOB
    Blood type
    ID
    */
    private String name;
    private String birthdate;
    private String bloodType;
    private int patientID;
    private static int currentID =1;// this means its final and cant be changed 
    //it is shared by ALL the objects of this class 
    //we use this to auto generate the patient IDSwith each patient

    public static int getCurrentID() {
        return currentID;
    }

    public patient(String name, String birthdate, String bloodType) {
        this.name = name;
        this.birthdate = birthdate;
        this.bloodType = bloodType;
        this.patientID = currentID;
        System.out.println(name +" has a birthday on the " + birthdate);
        currentID++;// every time you add a patient it will increement the ID for us 
    }
// getters 
    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }
//setter is only for the name only
    public void setName(String name) {
        this.name = name;
    }
    
}
