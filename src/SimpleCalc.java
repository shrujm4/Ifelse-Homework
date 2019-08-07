//input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if els
//Write a program to input 2 numbers and should be able to carry out Addition, subtraction, multiplication and division.
import java.util.Scanner;
//Main method creation
public class SimpleCalc {
    public static void main(String[] args) {

        char operator;
        int a,b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = scan.nextInt();

        System.out.println("Enter the second number: ");
        b = scan.nextInt();

        System.out.println("Enter the operator ( +, -, *, /): "); //Enter Operators
        operator = scan.next().charAt(0);
//Calculations to carry out operations
        if(operator == '+')
        {

        System.out.println("Sum of two number is: " + (a+b));}

        else if( operator == '-'){

            System.out.println("Subtraction of two number is: " + (a-b));}

        else if(operator == '*'){

            System.out.println("multiplication of two number is: " + (a*b));}

        else if (operator == '/'){

            System.out.println("Division of two number is: " + (a/b));}
        else{

            System.out.println("Wrong Operator");
        }





    }

}
