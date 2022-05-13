package hw9CarInterface;

public class SportDriver extends Driver{

    public String drivertype;

    public SportDriver(String drivertype,String name,int licence) {
        super(licence,name);
        this.drivertype = drivertype;
    }
}
