package n;

public class SportDriver extends  Driver{

    public int category;

    public SportDriver(int category) {
        this.category=category;
    }
    public void drive() {
        System.out.println( "Я еду fast due to my category="+category);
    }
}


