import java.util.Scanner;

//WAP to input marks and calculate total, %tage and if student is pass or failed based on each subject marks
//Also give grade based on total

public class StudentGrade2 {

//method creation
    public static void P() {

        String name;
        int rollnumber;
        float maths, science, english;
//input criteria
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Studen's Name: ");
        name = sc.next();

        System.out.println("Enter Roll Number: ");
        rollnumber = sc.nextInt();

        System.out.println("Enter Marks of Maths out of 100: ");
        maths = sc.nextFloat();

        System.out.println("Enter Marks of Science out of 100: ");
        science = sc.nextFloat();

        System.out.println("Enter Marks of English out of 100: ");
        english = sc.nextFloat();

        //Calculate total and percentage
        double total = maths + science + english;
        double Percentage = (double) total / 300 * 100;
//Output result
        System.out.println("Student Roll Number: " + rollnumber);
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + " (Total Marks = Maths+Science+English)");
        System.out.println("Total Percentage is: " + Percentage);

//Condition to check pass or failed in each subject
        if (maths< 35){

            System.out.println(name + " is Failed");}
        else if (science<35){

            System.out.println(name + " is Failed");}

        else if(english<35){

            System.out.println(name + " is Failed");}

         else {

            System.out.println(name + " is Pass");}


//calculates percentage

    if (Percentage>=85){
        System.out.println("Grade of " + name + " is " + "A+");
    }
    else if (Percentage>=60 && Percentage<85){

        System.out.println("Grade Of " + name + " is " + "A");
            }
    else if(Percentage>=50 && Percentage<60){
        System.out.println("Grade of " + name + " is " + "B");
            }
    else if (Percentage>=35 && Percentage<50){
        System.out.println("Grade of " + name + " is " + "C");
    }
    }

    public static void main(String[] args) {

        StudentGrade2.P();

    }

}
