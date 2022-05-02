package hw5Car;

public class LorryDriver extends  Driver{


    public boolean fozzy;

    public LorryDriver(int expYears,boolean fozzy) {
        super(expYears);
        this.fozzy=fozzy;
    }



    public void drive() {
        System.out.println( "За рулем водитель грузовичка с опытом "+getExpYears() +"лет.Он может возить принцип="+fozzy);

    }


}


