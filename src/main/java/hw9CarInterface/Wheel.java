package hw9CarInterface;

public  abstract class Wheel implements IWheel {
    public int radius;

    public int getRadius() {
        return radius;
    }

    public Wheel(int radius) {
        this.radius = radius;
    }

    public abstract String goWheel();
}
