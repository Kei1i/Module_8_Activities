/**
 * @(#)FibonacciSeries.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Practice;
public class FibonacciSeries_Kimmakim {
    public static void main(String[] args) {

        int x=0;
        int y=1;
        int z;

        System.out.print(x+" ");
        System.out.print(y+" ");

        do{
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        } while(z<144);
        
    }
    
}
