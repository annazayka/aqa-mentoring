package hw9CarInterface;

public abstract class Car implements ICar, IWheel {

    // у абстрактной машины есть колеса и двигатель
    public Engine engine;
    public Wheels wheel;


    protected Car(Engine engine, Wheels wheel) {
        this.engine = engine;
        this.wheel=wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }
    public Wheels getWheels() {
        return this.wheel;
    }

    public void setWheel(Wheels wheels) {
        this.wheel = wheels;
    }



    public void go(Driver driver) {
       System.out.println( "just car go");

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
    public void createCar() {
        System.out.println( getEngine().startEngine());
        System.out.println(getWheels().goWheel());


    }
}
