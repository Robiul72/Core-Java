
package dosum;

import domath.DoMath;
import java.util.Scanner;


public class DoSum {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DoMath dm=new DoMath();
        
        System.out.println("Enter your 1st number");
        int n1=input.nextInt();
        
        System.out.println("Enter your 2nd number");
        int n2=input.nextInt();
        
        System.out.println("Enter your 3th number");
        int n3=input.nextInt();
        
        System.out.println("Enter your 4th number");
        int n4=input.nextInt();
        
        System.out.println(dm.doSum(n1,n2,n3,n4));
        
    }
    
}
