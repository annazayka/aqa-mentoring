package hw5Car;

public class SportEngine extends Engine {

    private String sportengine;

    public SportEngine(String sportengine, int volume) {
        super(volume);
        this.sportengine = sportengine;
    }

    public String startEngine() {
        return "Двигатель установили " + this.sportengine + "и его объем двигателя-" + getVolume();

    }


}
