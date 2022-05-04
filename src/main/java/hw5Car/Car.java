package hw5Car;

import java.util.List;

public class Car {

    private String color;
    private int keys;
    private Engine engine;
    private Wheel wheel;
    private Driver driver;


    public void setEngine(Engine engine ) {
        this.engine = engine;
    }

    public Car(Engine engine1, Wheel wheel){
        this.engine=engine1;
         this.wheel=wheel;

    }



    public Engine getEngine() {
        return engine;
    }
    public Driver getDriver() {
        return driver;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKeys() {
        return keys;
    }



    public void createCar() {
        System.out.println("Вы выбрали"+getColor()+" цвет машинки");
        System.out.println( getEngine().startEngine());
        //getDriver().drive();

    }
}






