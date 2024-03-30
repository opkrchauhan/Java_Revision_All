//WAJP to store the information of a student such as name, rollNo, three subject mark as well as subject name and
// print the following int the following patter
//   Name : --------------------;
//   RollNo :-------------------;
//   Age :----------------------;
// Total Marks :----------------;
// Obtained Marks : ------------;
// Percentage :-----------------;


package Operator.Practice;

import java.util.Scanner;

public class Task4 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name ");
        String name = sc.nextLine ();
        System.out.println ("Enter the rollNo ");
        int rollNo = sc.nextInt ();
        System.out.println ("Enter the age ");
        int age = sc.nextInt ();
        int sum =0;
        int totalMarks = 300;
        for (int i=0;i<3;i++){
            System.out.println ("Enter the "+(i+1) +" subject name");
            String subjectName = sc.nextLine ();
            sc.nextLine ();
            System.out.println ("Enter the Subject Marks of "+(i+1));
            int mark = sc.nextInt ();
            sum +=mark;
        }

        System.out.println ("------------Details of Student------------------------");
        System.out.println ("Name : "+name);
        System.out.println ("RollNo : "+rollNo);
        System.out.println ("Age : "+age);
        System.out.println ("Total Marks : "+totalMarks);
        System.out.println ("Obtained Marks : "+sum);
        System.out.println ("Percentage : "+(sum*100)/totalMarks);

    }
}
