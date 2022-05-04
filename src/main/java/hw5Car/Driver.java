package hw5Car;

public class Driver {

    private int expYears;
    private int licence;


    public int getExpYears() {
        return expYears;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }

    public void drive() {
        System.out.println("simple drive");
    }

    public Driver(int expYears, int licence) {
        this.expYears = expYears;
        this.licence=licence;
    }

    public void putCarKey(int keys) {
        System.out.println("вставил ключи");


    }

    public void putGas() {
      //   System.out.println(this.checkKey(car));
         System.out.println("нажал на газ");
    }

    public String checkKey(Car car) {
        if (car.getKeys()==123)
        return "Ключи ОК";
        else return "wrong key";

    }

}
