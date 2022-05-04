package hw5Car;

public class SportDriver extends Driver {

    public int category;

    public SportDriver(int category,int expYears,int licence) {
        super(expYears,licence);
        this.category = category;
    }

    public void drive() {
        System.out.println("За руль посадили водителя " + this.category + " категории, поэтому он будет ехать быстро");
    }

    public void putGas() {

     //   System.out.println( checkKey(car));
        System.out.println("педальку в пол потому что он профи");
    }
}


