import java.io.IOException;

public class Homework1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your char: ");
        while (true) {
            int inputInt = System.in.read();
            char inputChar = (char) inputInt;
            if (inputInt >= 48 && inputInt <= 57) {
                System.out.println("This number is [0-9]: " + inputChar + " is int code is " + inputInt);
            } else if (inputInt >= 65 && inputInt <= 90) {
                System.out.println("This is Uppercase: " + inputChar + " is int code is " + inputInt);
            } else if (inputInt >= 97 && inputInt <= 122) {
                System.out.println("This is lowercase: " + inputChar + " is int code is " + inputInt);
            } else if (inputInt == 194) break;
            else if (inputInt == 10) {
                continue;
            } else System.out.println("else: " + inputChar + " is int code is " + inputInt);
        }
    }
}