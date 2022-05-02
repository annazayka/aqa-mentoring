package hw5Car;

public class RegularEngine extends Engine{

    public RegularEngine(int volume) {
        super(volume);
    }

    public  String   startEngine() {
        return "Вы грузовики устаавливают обычный двигатель с объмом  " + getVolume()+"";

    } }