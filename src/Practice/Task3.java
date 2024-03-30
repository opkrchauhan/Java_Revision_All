package Practice;

import java.util.Scanner;

public class Task3 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the name ");
        String name = sc.nextLine ();
        System.out.println ("Enter no of row");
        int n = sc.nextInt ();
        int count = 0;
        for(int i=1;i<=Integer.MAX_VALUE;i++) {
            for(int j=1;j<=i;j++) {
                if(count<name.length ()) {
                    System.out.print (name.charAt (count)+" ");
                }
                else{
                    System.out.print ("* ");
                }
                count++;
            }
            System.out.println ();
            if(count>=name.length ()){
                break;
            }
        }
    }
}
