package n;

public class Go {

    public static void main(String[] args) {
        Car car = new SportCar(true);
        car.start();

        Driver driver= new LorryDriver(false);
        driver.setExpYears(5);
       driver.putCarKey(1263);
        if (driver.putCarKey(123)==true){
            System.out.println("Key Ok");
            car.turnCarKey();
        }
        else System.out.println("Wrong Key");

        checkDriver(driver);
    }

    public static void checkDriver(Driver driver){
       if(driver.getExpYears()>0) driver.drive();
       else System.out.println("Experience is need");
    }
}
