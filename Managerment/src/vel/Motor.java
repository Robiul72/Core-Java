
package vel;

public class Motor extends Vehicle{

    public Motor() {
    }

    public Motor(String registraNumber, String brand, int year) {
        super(registraNumber, brand, year);
    }

    @Override
    public void details() {
        super.details(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void start() {
        System.out.println("Motor is start ");
    }

    @Override
    public void stop() {
        System.out.println("Motor is stop ");
    }
    
}
