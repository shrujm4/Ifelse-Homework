import java.util.Scanner;
//Find Leap year simple way. When googled the logic was different as this logic does not calculate correct Leap Year for
//century years. Hence second program was written
public class LPYearFirst {
    public static void main(String[] args) {
//input parameters
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");

        int year = scan.nextInt();

        //Calculate Leap year

        if(year % 4 == 0)
            System.out.println(" is a leap year");
        else
        System.out.println(" is not a leap year");


    }
}
