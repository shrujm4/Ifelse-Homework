
//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry

import java.util.Scanner;
//main class
public class CityName {
//main method
    public static void main(String[] args) {
//declaration of the character
        char ch;
//scanner command
        Scanner scan = new Scanner(System.in);
//input alphabet
        System.out.println("Enter the alphabet: ");
        ch = scan.next().charAt(0);
//if else condition to check city name
        if(ch == 'a'){
            System.out.println("A for Ahmedabad");}
        else if(ch =='b'){
            System.out.println("B for Bihar");}
        else if(ch == 'c'){
            System.out.println("C for Chandigarh");}
        else if(ch == 'd'){
            System.out.println("D for Delhi");}
        else if(ch == 'e'){
            System.out.println("E for Etanagar");}
        else if(ch == 'f'){
            System.out.println("F for Faridabad");
        }
            else{
            System.out.println("Invalid Character!");
        }
    }
}
