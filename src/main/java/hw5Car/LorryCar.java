package hw5Car;

public class LorryCar extends Car {
    public LorryCar(Engine engine, Driver driver) {
        super(engine,driver);
        this.setEngine(new RegularEngine(engine.getVolume()));

    }
}
