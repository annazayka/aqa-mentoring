package n;

public class LorryDriver extends  Driver{

    public boolean fozzy;

    public LorryDriver(boolean isfozzy) {
        this.fozzy=isfozzy;
    }

    public void drive() {
        System.out.println( "Я еду на грузовичке"+getExpYears() +"лет with fozzy="+fozzy);

    }


}


