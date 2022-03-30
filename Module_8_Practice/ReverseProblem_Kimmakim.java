/**
 * @(#)ReverseProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Practice;
import java.util.Scanner;
public class ReverseProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 

        System.out.print("Input a number: ");
        int x=input.nextInt();
        int xr=0;
        int sum=0;
        
        while (x>0){
            int y=x%10;
            xr=xr*10+y;
            int z=x%10;
            sum=sum+z;
            x/=10;
        }
        System.out.println("The reversed order is "+xr);
        System.out.println("The sum is "+sum);


        
    }
    
}
