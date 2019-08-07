
//input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary


import java.util.Scanner;

public class GrossSalary {

    public static void Salary(){
int employeeId;
String name;
float BS,HRA,TA,DA,PF,GS;   //float values as all the figures can be in decimal value

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Employee ID: ");
        employeeId = scan.nextInt();
        scan.nextLine();    // extra line was given to stop having issue of input character for employee name

        System.out.println("Enter the Employee Name: ");
        name = scan.nextLine();

        System.out.println("Enter the Basic Salary (in Rupees): ");
        BS = scan.nextFloat();

        HRA = (float) BS*10/100; //formula to find HRA
        TA = (float) BS*9/100;   // formula to find TA
        DA = (float) BS*8/100;  // formula to find DA
        PF = (float) BS*20/100; //formula to find PF

       GS = (BS + HRA + TA + DA - PF);  // formula to find gross salary

        System.out.println("Gross Salary of " +name+ " is " + "Rupees " + GS); // for the output

    }

    public static void main(String[] args) {

        GrossSalary.Salary();   // Salary method called for an output
    }



}
