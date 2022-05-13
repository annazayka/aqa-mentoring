package hw9CarInterface;

public class Test {
    public static void main(String[] args) {
        Car car = new SportICar(new SportEngine(5),new Wheels());
        Driver driver= new SportDriver("123","Hana",1234);
        car.createCar();
        car.go(driver);



    }
}
