import java.util.Scanner; //WAP process to find out if number is odd or even

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //input object

        System.out.println("Enter the first number: ");

        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");

        int b = scanner.nextInt();


        String OddEven = (a/ 2 == 0) ? "even number" : "odd number";// system will check if given number is divided by 2 and remainder is 0 then its even else odd

        String star = (b% 2 == 0) ? "even number" : "odd number";


        // Turnery operators ? and : works just like If Else statements

        System.out.println(a + " is " + OddEven);

        System.out.println(b + " is " + star );

    }






}
