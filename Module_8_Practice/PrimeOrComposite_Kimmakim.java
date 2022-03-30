/**
 * @(#)Series1Problem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Practice;
import java.util.Scanner;
public class PrimeOrComposite_Kimmakim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            System.out.print("Input an integer: ");
            int x=input.nextInt();
            int y=2;
            boolean z= false;

            while (y<=x/2) {
              if (x%y==0){
                z=true;
                break;
              }
              y++;
            }
            if (!z)
              System.out.println(x + " is a prime number.");
            else
              System.out.println(x + " is a composite number.");
    }
    
}
