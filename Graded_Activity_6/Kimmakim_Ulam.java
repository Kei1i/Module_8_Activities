/**
 * @(#)Ulam.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activity_6;
import java.util.Scanner;
public class Kimmakim_Ulam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input N: ");
        int x=input.nextInt();
        String y=""+x;

        while (x>1) {

            if (x%2==0) 
                x=x/2;
            else  
                x=3*x+1;

            y=y+", "+x;
        }
        System.out.println("Ulam Sequence: ");
        System.out.println(y);

    }
}
