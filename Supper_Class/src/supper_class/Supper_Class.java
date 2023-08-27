
package supper_class;

import vehicle.Truck;
import vehicle.Vehicle;


public class Supper_Class {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Truck truck = new Truck();
        
        truck.setRegularPrice(1000);
        truck.setWeight(3000);
        
        System.out.println("price after discount "+truck.getSalePrice());

    }
    
}
