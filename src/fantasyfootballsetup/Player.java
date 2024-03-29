/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author Stefani Nunes
 */
public abstract class Player {
    private String fname;
    private String lname;
    private String country;
    private int age;
    private String position;
    //encapsulates fields means that you can control and make changes private

    
    //CONSTRUCTOR
    public Player(String fname, String lname, String country, int age, String position) {
        this.fname = fname;
        this.lname = lname;
        this.country = country;
        this.age = age;
        this.position = position;
    }

    //GETTER
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
    
   //SETTER
    
     public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
