
package vel;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registraNumber, String brand, int year) {
        super(registraNumber, brand, year);
    }

    @Override
    public void details() {
        super.details(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void start() {
        System.out.println("Car is start ");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop ");
    }
    
}
