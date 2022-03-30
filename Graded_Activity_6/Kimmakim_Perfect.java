/**
 * @(#)PerfectProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activity_6
;
import java.util.Scanner;
public class Kimmakim_Perfect {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input N: ");
        int x=input.nextInt();
        int sum=0;

        for(int y=1;y<x;y++)
            if(x%y==0){
                sum=sum+y;
        }
        if(sum==x) 
            System.out.println(x+" is perfect");
        
        else if(sum<x) 
            System.out.println(x+" is deficient");
        
        else 
            System.out.println(x+" is abundant");

    }
}
