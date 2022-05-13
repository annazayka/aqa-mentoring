package hw9CarInterface;

public class SportICar extends Car {

    public String turbineType;

    public SportICar(Engine engine, Wheels wheels) {
        super(engine,wheels);
    }



    public void go(Driver driver) {

        System.out.println("SportCar go becouse driver has licence #"+driver.getLicence());
    }

    @Override
    public void goSlow() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turn() {

    }

    @Override
    public String goWheel() {
        return "goWheel";
    }

    @Override
    public void stopWheel() {

    }
}