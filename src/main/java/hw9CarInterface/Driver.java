package hw9CarInterface;

public class Driver implements IDriver{

    public int licence;
    public String name;

    public Driver(int licence, String name) {
        this.licence = licence;
        this.name = name;
    }



    @Override
    public void driver() {
        System.out.println("driver drive a car");
    }

    public int getLicence() {
        return licence;
    }

    public void setLicence(int licence) {
        this.licence = licence;
    }
}
