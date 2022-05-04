package hw5Car;

import java.util.List;

public class SportCar extends Car{
    private String sportengine="superSportEngine";

    public SportCar(Engine engine, Wheel wheel) {
        super(engine,wheel);

    }

    public void setEngine(Engine engine) {
        super.setEngine(new SportEngine(sportengine, engine.getVolume()));
    }
}
