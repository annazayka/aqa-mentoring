package n;

public class SportCar extends Car{
    private boolean superengine;

    public SportCar(boolean superengine) {
      //  super();
        this.superengine = superengine;

    }

    public void start(){
        System.out.println("start sportcar with"+superengine);
    }


}
