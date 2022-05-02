package hw5Car;

public class Go {

    public static void main(String[] args) {
        Car car = new SportCar(new Engine(2),new SportDriver(5,3));
        car.setColor(" зеленый");

        car.createCar();
        car.getDriver().putCarKey(123);

        Car car1 = new LorryCar(new Engine(3), new LorryDriver(3, true));
        car1.createCar();

    }





//        Driver driver= new LorryDriver(false);
//        driver.setExpYears(5);
//       driver.putCarKey(1263);
//        if (driver.putCarKey(123)==true){
//            System.out.println("Key Ok");
//            car.turnCarKey();
//        }
//        else System.out.println("Wrong Key");
//
//        checkDriver(driver);
//    }
//
//    public static void checkDriver(Driver driver){
//       if(driver.getExpYears()>0) driver.drive();
//       else System.out.println("Experience is need");
//    }
}
