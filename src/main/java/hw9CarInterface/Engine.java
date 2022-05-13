package hw9CarInterface;

public abstract class Engine implements IEngine{
    public int volume;

    public Engine(int volume) {
        this.volume = volume;
    }

    @Override
    public String startEngine() {
        return "Engine start";
    }

    @Override
    public String stopEngine() {
        return "Engine stop";
    }

    public int getVolume() {
        return volume;
    }
}
