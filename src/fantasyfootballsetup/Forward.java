/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author Stefani Nunes
 */
public class Forward extends Player {
    
    int numGoalsScored; 
    
    public Forward(String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
    }
   //super passes these values to the parent's contructors  

    public Forward(int numGoalsScored, String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalsScored = numGoalsScored;
    }
    
    
}
