
//input any number and fid our if it is positive , negative or zero


import java.util.Scanner;

public class CompareValue {

    public static void main(String[] args) {

        int number;

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = Scan.nextInt();

//condition to check if number is positive, negative or zero
        if(number>0) {

            System.out.println("The number entered is positive");
        }

        else if (number<0){

            System.out.println("The number entered is negative");
        }
        else {
            System.out.println("The number entered is zero");
        }
    }

}
