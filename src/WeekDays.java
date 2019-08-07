
//WAP input any number, the print Day name of the week accordingly by using if else


import java.util.Scanner;


public class WeekDays {

    public static void main(String[] args) {

        int Day;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number between (1 - 7) to find days name: ");
        Day = scan.nextInt();
//Program to input number and output as Days using switch method
        //This program can execute using if else condition.
        switch (Day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
             default:
                 System.out.println("Invalid Entry enter number between (1-7) only");




        }


    }



}
