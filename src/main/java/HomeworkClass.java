import java.io.IOException;
import java.util.Scanner;

public class HomeworkClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            System.out.println(floatChar(sc.nextFloat()));
            System.out.println(floatCharInt(sc.nextFloat()));
        } else {
            char inputInt = sc.next().charAt(0);
            charBite(inputInt);
        }
    }

    public static byte charBite(char charValue) {
        return (byte) charValue;
    }

    public static char floatChar(float floatValue) {
        return (char) floatValue;
    }

    public static int floatCharInt(float floatValue) {
        return (int) (char) floatValue;
    }
}