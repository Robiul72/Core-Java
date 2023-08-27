
package factorialnumber;

import factorial.FactorialMath;
import java.util.Scanner;


public class FactorialNumber {


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        FactorialMath in=new FactorialMath();
        
        System.out.println("Enter number");
        int n =input.nextInt();
        
        System.out.println(in.fac(n));
    }
    
}
