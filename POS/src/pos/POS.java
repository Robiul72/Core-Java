
package pos;

import java.util.Scanner;
import price.Sales_Price;


public class POS {


    public static void main(String[] args) {
       
        Sales_Price price = new Sales_Price();
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter Quantity ");
        double quantity = input.nextDouble();
        
        System.out.println("Enter UnitPrice ");
        double unitPrice = input.nextDouble();
        
        double actualPrice = 0.0;
        
        price.setQuantity(quantity);
        price.setUnitPrice(unitPrice);
        
        double total = price.totalPrice();
        
        double discount = 0.0;
        if(total >=100){
        discount = (int)(total*.05);
        actualPrice = total-discount;
        }
        else{
        actualPrice = discount;
        }
        
        System.out.println("Total Amount is "+total);
        System.out.println("Discount Amount is "+discount);
        System.out.println("You have to pay "+Math.round(actualPrice));
    }
    
}
