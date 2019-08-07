import java.util.Scanner;
//WAP to input few input fields to find out if student is pass or failed based on the %tage and give them grade accordingly
public class StudentGrade {


    public static void StudentPercentage() {

        String name;
        int rollnumber;
        float physics, chemistry, biology;

//input fields
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student's Name: ");
        name = scan.nextLine();

        System.out.println("Enter Student's Roll Number: ");
        rollnumber = scan.nextInt();



        System.out.println("Enter marks for Physics: ");
        physics = scan.nextFloat();

        System.out.println("Enter marks for Chemistry: ");
        chemistry = scan.nextFloat();

        System.out.println("Enter marks for Biology: ");
        biology = scan.nextFloat();

        //Formula to calculate total marks & Percentage

        float total = physics + chemistry + biology;
        float percentage = total/300*100;


//output print criteria
        System.out.println("Student Roll Number: " + rollnumber);
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + " (Total Marks = Physics+Chemistry+Biology");
        System.out.println("Total Percentage is: " + percentage);

        //Condition to check above input numbers
        if(percentage>=35)
            System.out.println(name + " is pass");
        else
            System.out.println(name + " is failed");


        if(percentage>=85){

            System.out.println("Grade of " + name +" " + " is " + "A+");}

        else if(percentage>=60 && percentage<85){


            System.out.println("Grade of " + name + " " + " is " + "A");}
        else if(percentage>=50 && percentage<60){


            System.out.println("Grade of " + name + " " + " is " + "B");}
        else if(percentage<50 && percentage>=35){



                    System.out.println("Grade of " + name + " " + " is " + "C");}

    }

//Main method
    public static void main(String[] args) {

        StudentGrade.StudentPercentage(); //declaration of method above

    }




}



