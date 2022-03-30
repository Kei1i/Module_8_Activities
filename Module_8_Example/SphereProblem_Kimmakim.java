/**
 * @(#)SphereProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_8_Example;

public class SphereProblem_Kimmakim {
    public static void main(String[] args) {
        int R=1;

        System.out.println("Radius\tArea\tVolume");
        while(R<=20){
            double V=(4*(Math.PI)*(R*R*R))/3;
            double A=4*(Math.PI)*(R*R);
            System.out.println(R+"\t"+Math.round(A*100.0)/100.0+"\t"+Math.round(V*100.0)/100.0);
            R++;
        }
        
    }
    
}
