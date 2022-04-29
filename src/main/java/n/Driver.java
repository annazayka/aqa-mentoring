package n;

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

    public Boolean putCarKey(int keys) {
        Car car = new Car();
        if (car.getKeys() == keys) return true;
        else return false;

    }

    public Boolean isLicenceValid(int licence) {

        return true;
    }

}
