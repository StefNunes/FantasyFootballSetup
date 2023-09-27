/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootballsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Stefani Nunes
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       int optionNum = mainMenu();
       if (optionNum == 1) {
           dataInput(); 
       }
      // else 
        
    }
    public static int mainMenu() {
        System.out.println("Welcome to Fantasy Football");
        System.out.println("MENU");
        System.out.println("Please select an option:");
        System.out.println("1- Initialise the program with data");
        System.out.println("2- Enter a team");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine(); 
       // int optionNum = Integer.parseInt(option);
       return Integer.parseInt(option);
    }
    public static void dataInput() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData1.csv"));
        String line;//to read each line 
        while ((line = br.readLine()) != null) {
            
            
             String[] playerData = line.split(",");
             System.out.println(playerData[0]);
             if (playerData[4].equals("Forward")){
                 Forward player = new Forward(0, playerData[0], playerData[1], playerData[2],Integer.parseInt(playerData[3]), playerData[4]);
                 player.
             }
        }
       
   //     System.out.println("The Firt Line is :" + line);
        
    }
}
