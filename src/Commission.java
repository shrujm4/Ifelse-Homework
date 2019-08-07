
//input sales id, seller's name, sales amount, salary basic and then ﬁnd this sales commission

import java.util.Scanner;

public class Commission { //Class Commission

    public static void main(String[] args) { //Main method

        int SalesId;
        String name;
        float SA, BS, SC, GS;

        Scanner scan = new Scanner(System.in);

        //Input Variables for program

        System.out.println("Enter the employee ID: ");
        SalesId = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the employee name: ");
        name = scan.nextLine();

        System.out.println("Enter the Sales Amount: ");
        SA = scan.nextFloat();

        System.out.println("Enter the Basic Salary: ");
        BS = scan.nextFloat();

        //Calculations of condition
        if(SA>=50000){

            SC = BS*35/100;
        }
    else if(SA>=30000 && SA<50000){

        SC = BS*20/100;
        }
    else if(SA>=20000 && SA>30000){

        SC = BS*10/100;}

    else if(SA>=10000 && SA<20000){

        SC = BS*5/100;}

        else{

            SC = BS*2/100;
                }

        GS = SC + BS;

        System.out.println("The Employee ID: " + SalesId);
        System.out.println("The Employee name is: " + name);
        System.out.println("Sales Amount is: " + SA);
        System.out.println("Basic Salary of " + name + " is = " + BS);
        System.out.println("The commission of " + name+ " is " + SC);
        System.out.println("Gross Salary = " + GS + " (Basic Salary + Sales Commission) " );


    }

//Program compiled and run successfully as per the need

    }


