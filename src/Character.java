
//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input.

import java.util.Scanner;

public class Character {

    public static void main(String[] args) {

        char ch;
//Scanner object creation.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Alphabet: ");
        ch = scan.next().charAt(0);

        //if else if condition to differentiate between numbers, vowel and consonant

        if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
            System.out.println("Entered Alphabet " + ch + " is Vowel");
        }
        else if ((ch>='a' && ch<='z') || (ch>= 'A' && ch<='Z')){

            System.out.println("Entered Alphabet " + ch + " is Consonant" ); // for output
        }
        else{
            System.out.println("Invalid Entry, please enter Alphabet"); //for output
        }
        }


    }



