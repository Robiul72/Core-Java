package abstractmethod_02;

import val.Car;
import val.MotorCycle;
import val.Vehicle;

public class AbstractMethod_02 {

    public static void main(String[] args) {

        Vehicle car = new Car("k-2514", "BMW", 2021);
        Vehicle motor = new MotorCycle("L-2154", "BM", 2022);

        System.out.println("Car Details");
        car.details();
        car.strat();
        car.stop();
        System.out.println("");
        System.out.println("MotorCycle Details");
        motor.details();
        motor.strat();
        motor.stop();
    }

}
