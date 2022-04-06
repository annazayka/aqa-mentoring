import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                System.out.println("You input number " +  (char) sc.nextInt());
            } else {
                char inputInt = sc.next().charAt(0);
                if (inputInt == 167) break;
                else System.out.println("Sorry, this is not number. Please check!!");
            }
        }
    }
}
