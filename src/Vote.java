import java.util.Scanner;

//WAP to input age and check if person is eligible to vote or not.

public class Vote {

    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age: ");
        age = scan.nextInt();
//Condition to check given criteria
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not eligible to Vote");}
    }



}
