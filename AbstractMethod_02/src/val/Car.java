package val;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void details() {
        super.details();
    }

    @Override
    public void strat() {
        System.out.println("Car is Start ");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stop ");
    }

}
