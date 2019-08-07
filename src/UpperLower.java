
//Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UpperLower {

    public static void main(String[] args) {
//Variable declaration
        char ch;
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character in Upper Case: ");
        ch = scan.next().charAt(0);

        //calculation to change order of character

        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;;

        System.out.println("Character converted in Lower Case: " + ch);


    }
}
