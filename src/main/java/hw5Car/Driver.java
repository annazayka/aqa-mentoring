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

    public Driver(int expYears) {
        this.expYears = expYears;
    }

    public void putCarKey(int keys) {
        System.out.println("вставил ключи");
        this.putGas();

    }

    public void putGas() {
        //return "нажал газ";
System.out.println("нажал на газ");
    }

    public String stopGas(int keys) {
        return "нажал на тормоз";

    }

}
