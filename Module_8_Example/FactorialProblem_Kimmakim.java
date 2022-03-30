/**
 * @(#)FactorialProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Example;
import java.util.Scanner;
public class FactorialProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input a Number: ");
        int x=input.nextInt();
        int y=1;

        for (int z=1;z<=x;z++){
            y=y*z;
        }
        System.out.println("The Factorial of "+x+" is "+y);
    }
}