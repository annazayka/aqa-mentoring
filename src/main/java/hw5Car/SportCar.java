package hw5Car;

public class SportCar extends Car{
    private String sportengine="superSportEngine";

    public SportCar(Engine engine,Driver driver) {
        super(engine,driver);
        this.setEngine(new SportEngine(sportengine, engine.getVolume()));

    }
}
