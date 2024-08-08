/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        int number;
        
        do
        {
            System.out.println("Enter greater than 10: ");
            number = obj.nextInt();
        }
        while(number <= 10);
        {
            System.out.println("You entered an invalid number:  " + number);
            obj.close();
        }
    }
    
}
