/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparestrings;

import java.util.Scanner;

public class CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a string to check for a digit: ");
        String word = obj.nextLine();
        
        //call a method that validate a string for a digit
        
        CheckForDigit check = new CheckForDigit();
        
        System.out.println("String has a digit?: " + check.DigitMethod(word));
        
        
        
    }//end of main method
    public static class CheckForDigit{
        //example
        //input = Junior12
        public boolean DigitMethod(String input){
            for(int i = 0; i < input.length(); i++){
                if(Character.isDigit(input.charAt(i))){
                    return true;
                }//end of is statements
            }//end of for loop
            return false;
        }//end digit method
    }//end of check string class
}
