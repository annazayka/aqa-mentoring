package n;

public class Car {

    private String color;
    private int keys;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKeys() {
        this.keys=123;
        return keys;
    }
    public void start() {
        System.out.println( "car is starting");
    }

    public void drive() {
        System.out.println( "driver is set");
    }

    public void stop() {
        System.out.println( "auto is stop");
    }

    public String turnCarKey(){
        return "start";
    }

}






