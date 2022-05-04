package hw5Car;

public class Engine {

    private int volume;

    public Engine (int volume){
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }

    public  String   startEngine() {

       return  "Simple engine is starting";

    }
}
