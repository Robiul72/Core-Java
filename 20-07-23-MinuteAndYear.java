
package minuteandyear;

import java.util.Scanner;

public class MinuteAndYear {

 
    public static void main(String[] args) {
       
        Scanner time=new Scanner (System.in);
        
        System.out.println("Enter your minute");
        
        int minute = time.nextInt();
        int remainderminute = minute % 60;
        
        
        int toatalhour = minute / 60;
        int remainder1hour = toatalhour % 24;
        
        int totalday = toatalhour / 24;
        int remainderday = totalday % 30;
        
        int totalmounth = totalday / 30;
        int remaindermount = totalmounth % 12;
        
        int year = totalmounth / 12;
        
        
        System.out.println(remainderminute+" minute");
        System.out.println(remainder1hour+" Hour");
        System.out.println(remainderday+ " Day");
        System.out.println(remaindermount+ " Mounth");
        System.out.println(year+ " Year");
          
        
    }
    
}
