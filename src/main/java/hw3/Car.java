package hw3;

public class Car {
    public static void main(String[] args) {
        startCar("Hanna");

    }

    private static String startCar(String driverName) {
        Driver putCarKey = new Driver();
        putCarKey.putCarKey(driverName);
        putCarKey.turnCarKey();

        Engine startEngine = new Engine();

        if (startEngine.isOk() == true) {
            Engine engineStart = new Engine();
            int speed = engineStart.putGas(1);
            return "Go";

        } else return "not Go";
    }
}
