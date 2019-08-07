//WAP to find Leap Year for the Year

// WAP to calculate Leap Year
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        boolean Leap = false; //used condition to check if argument is correct or not

        Scanner year = new Scanner(System.in);

        System.out.println("Enter the Year: ");
        int a = year.nextInt();

        // Leap year does not calculate using 4 but if the year is divisible by 100 then its divisible by 400
        //century year are more difficult to calculate using 4 so we require 100 and 400.

        if (a % 4 == 0){
            if (a % 100 == 0){

                if (a % 400 == 0){
                    Leap = true;
                }

            else
                Leap = false;
            }
            else
                Leap = true;
        }


            else Leap = false;


            if(Leap) // To print comment
                System.out.println(" is a leap year");
            else
                System.out.println(" is not a leap year");
    }




}
