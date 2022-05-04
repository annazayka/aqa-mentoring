package hw5Car;

public class Go {

    public static void main(String[] args) {
        Car car = new SportCar(new Engine(2), new Wheel(14,"nokian"));
        Driver driver=new SportDriver(5,7,987);
        car.setKeys(123);

        driver.checkKey(car);
        driver.drive();
        car.setColor(" зеленый");

        car.createCar();
        System.out.println(driver.checkKey(car));
        driver.putGas();


//        Car car1 = new LorryCar(new Engine(3), new Wheel(3, "testweel"));
//        car1.createCar();
//        car1.getDriver().putCarKey(555);
//        car1.getDriver().putGas();

    }
}
