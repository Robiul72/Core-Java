
package javaapplication72;

import geo.Circle;
import geo.Geometric;
import geo.Rectangle;

public class JavaApplication72 {


    public static void main(String[] args) {
        Geometric cir = new Circle(5);
        Geometric rec = new Rectangle(10, 20);
        
        System.out.println("Circle is "+cir.getArea());
        System.out.println("Rectengle is " +cir.getaPeremiter());
        
        System.out.println("");
        
        System.out.println("Circle is "+rec.getArea());
        System.out.println("Rectengle is "+ rec.getaPeremiter());
        
    }
    
}
