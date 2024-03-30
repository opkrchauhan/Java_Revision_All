//WAJP  to store info of a student & print all the details in a resume format like name, age, emailId, 2 line intro about standard
//& subject marks with subject name
package Practice;

import java.util.Scanner;

public class Task1 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the name : ");
        String name = sc.nextLine ();
        System.out.print ("Enter the age : ");
        int age = sc.nextInt ();
        System.out.print ("Enter the emailId : ");
        String emailId = sc.nextLine ();
        System.out.print ("Enter the Intro : ");
        String intro = sc.nextLine ();

        System.out.print ("Enter the first subject name : ");
        String subject1 = sc.nextLine ();
        System.out.print ("Enter the second subject name : ");
        String subject2 = sc.nextLine ();
        System.out.print ("Enter the third subject name : ");
        String subject3 = sc.nextLine ();

        System.out.print ("Enter the first subject marks : ");
        int marks1 = sc.nextInt ();
        System.out.print ("Enter the second subject marks : ");
        int marks2 = sc.nextInt ();
        System.out.print ("Enter the third subject marks : ");
        int marks3 = sc.nextInt ();

        System.out.println ("--------------------Resume Details are-------------------");
        System.out.println ("Name : "+name);
        System.out.println ("Age : "+age);
        System.out.println ("Email-id : "+emailId);
        System.out.println ("Introduction : "+intro);
        System.out.println ("-------------Subject Name with Marks -------------------");
        System.out.println (subject1 +" : "+marks1);
        System.out.println (subject2 +" : "+marks2);
        System.out.println (subject3 +" : "+marks3);
    }
}
