//Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class CheckNumberAlphaSymbol {

    public static void main(String[] args) {

//declaration of character
        char ch;
//Scanner object creation
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number Between [0-9], any Alphabets or Symbol: ");

        ch = scan.next().charAt(0); // ch declared as an object

//condition to check our given criteria

        if(ch>=0 && ch<=9){
            System.out.println("Entered character is Number");
        }
        else if (ch>9){

            System.out.println("Entered character is not allowed!! System can accept only between [0 -9]");
        }
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){

            System.out.println("Entered character is Alphabet");
        }
        else{
            System.out.println("Entered character is Symbol");
        }












    }

}
