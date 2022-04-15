package hw3;

import java.util.List;

public class Car {
    public Driver driver;
    public Engine engine;
    public List<Wheel> wheels;

    public static void main(String[] args) {
        new Car().startCar("Hanna");

    }

    private String startCar(String driverName) {
        driver = new Driver();
        driver.putCarKey(driverName);
        driver.turnCarKey();

        engine = new Engine(12F);

        if (engine.isOk() == true) {
//            Engine engineStart = new Engine();
            int speed = engine.putGas(1);
            return "Go";

        } else return "not Go";
    }
}
