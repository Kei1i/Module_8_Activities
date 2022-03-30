/**
 * @(#)Series1Problem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Practice;
public class Series1Problem_Kimmakim {
    public static void main(String[] args) {

        double x=1;
        double sum=0;
        do {
            sum=sum+(1/x);
            x++;
            System.out.println("@n = "+(x-1)+", "+Math.round(sum*10000.0)/10000.0);
        } while(sum<3.1);
        
    }
}
