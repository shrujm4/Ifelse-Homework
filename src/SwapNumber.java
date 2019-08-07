//WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        int a, b, temp; //declare value as integer

        Scanner scan = new Scanner(System.in);
//Before interchange
        System.out.println("Enter the first number: ");
        a = scan.nextInt();
        System.out.println("Enter the second number: ");
        b = scan.nextInt();

        //After interchange
        temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers interchanged successfully");
        System.out.println("First number is: " +a);
        System.out.println("Second number is: " +b);
    }
}
