
package maxminnumber;

import java.util.Scanner;
import maxmin.MainMaxMinNumber;


public class MaxMinNumber {


    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        MainMaxMinNumber in=new MainMaxMinNumber();
        
        System.out.println("item number");
        int n =input.nextInt();
        
        System.out.println("given number");
        int n1 =input.nextInt();
        
        System.out.println(in.mainmax(n));
    }
    
}
