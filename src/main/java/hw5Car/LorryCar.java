package hw5Car;

public class LorryCar extends Car {
    public LorryCar(Engine engine, Wheel wheel) {
        super(engine,wheel);
        this.setEngine(new RegularEngine(engine.getVolume()));

    }
}
