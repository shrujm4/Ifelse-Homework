//input any five number and then find average of five numbers

import java.util.Scanner;

//Class creation
public class AverageNumber {
//Method creation
    public static void Average(){

        int a,b,c,d,e;

        Scanner scan = new Scanner(System.in);
//Input variables
        System.out.println("Enter the first number: ");
        a = scan.nextInt();

        System.out.println("Enter the second number: ");
        b = scan.nextInt();

        System.out.println("Enter the third number: ");
        c = scan.nextInt();

        System.out.println("Enter the forth number: ");
        d = scan.nextInt();

        System.out.println("Enter the fifth number: ");
        e = scan.nextInt();

//formula to find average for 5 numbers
        int avg = (a+b+c+d+e)/5;

        //Checking condition
        if (a>100){


            System.out.println("Please enter the number between 0 - 100");}
        else if (b>100){

            System.out.println("Please enter the number between 0 - 100");

        }
        else if (c>100){
            System.out.println("Please enter the number between 0 - 100");
        }
        else if (d>100){

            System.out.println("Please enter the number between 0 - 100");
        }
        else if(e>100){

            System.out.println("Please enter the number between 0 - 100");

        }
        else {

            System.out.println("The Average of above number is: " + avg);
        }




        }


    public static void main(String[] args) {

        AverageNumber.Average(); //calling method in main method for the execution
    }

}
