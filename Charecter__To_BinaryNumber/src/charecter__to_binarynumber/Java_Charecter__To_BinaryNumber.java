
package charecter__to_binarynumber;

import java.util.Scanner;


public class Charecter__To_BinaryNumber {


    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner (System.in);
        
//              Binary number  ber kora

        char ch = sc.next().charAt(0);
        
        if(ch >= (char) 65  && ch <= (char) 90)
            {
            System.out.println("Upper Case");
            System.out.println((int) ch) ;
            System.out.println(Integer.toBinaryString(ch));  
            }

        else {
            System.out.println(" Lower Case");
            System.out.println((int) ch) ;
             System.out.println(Integer.toBinaryString(ch));
            }
    }
    
}
