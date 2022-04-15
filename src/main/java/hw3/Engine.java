package hw3;

public class Engine {

    Float volume;
    public Engine(Float volume) {
        this.volume = volume;
    }

    public  boolean isOk(){
        if (volume > 10) {
            return true;

        }
        return false;
    }
    public int putGas(int mode){
        return mode*2;
    }
}
