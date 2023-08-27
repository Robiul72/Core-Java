
package price;

import calculate.Sub_Price;
import java.util.Scanner;

public class Price {

    public static void main(String[] args) {
       
        Sub_Price price = new Sub_Price();
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter Quantity ");
        double quality = input.nextDouble();
        
        System.out.println("Enter UnitPrice ");
        double unitPrice = input.nextDouble();
        
          double actualPrice = 0.0;
          
        price.setQuantity(quality);
        price.setUnitPrice(unitPrice);
        
        double totalPrice = price.totalPrice();
        
        double discount = 0.0;
        
        if(totalPrice>=100){
        
            discount=(totalPrice*.05);
            
            actualPrice =totalPrice-discount;
        }
        else{
        actualPrice = totalPrice;
        }
        
        
        
        System.out.println("Total Amount is "+totalPrice);
        
        System.out.println("Discount Amount is "+Math.round(discount));
        
        System.out.println("You have to pay Total Amount is  "+(int)actualPrice);
        
    }
    
}
