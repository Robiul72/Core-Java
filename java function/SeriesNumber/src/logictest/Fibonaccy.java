
package logictest;

import java.util.Scanner;

public class Fibonaccy {
    
    public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
        System.out.println(" Enter item number");
        int n = input.nextInt();
        
        int n1 = 0; // jodi 5 theke start korte bole int n1 = 5;
        int n2 =1;  //                                int n2 = 6; hobe
        int sum = 0;
        
        System.out.println(n1);
        System.out.println(n2);
        
        for(int i =3; i<= n; i++)
        {
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }   
}
