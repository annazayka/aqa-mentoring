package hw9CarInterface;

public class SportEngine extends Engine {

    public SportEngine(int volume) {
        super(volume);
    }

    @Override
    public String startEngine() {
       return "SportCar engine go";

    }

    @Override
    public String stopEngine() {
return "";
    }
}
