package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long minutes = 3456789l; //
        System.out.println(task1(minutes));
        System.out.println (task2(System.currentTimeMillis()));
        System.out.println(task3());
    }

    public static String task1(long minutes) {
        return minutes + " min is " + minutes / 525600 + " years and " + minutes % 525600 / 1440 + " days.";
    }

    public static String task2(long timenow) {
        return "Now is:" + ((timenow / 1000) / 3600) % 24 + ":" + ((timenow / 1000) / 60) % 60;
    }

    public static String task3() {
        System.out.print("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int max;
        int min;
        int Sum = first + second;
        int diff = first - second;
        int mul = first * second;
        float av = (first + second) / 2;
        int dis = second - first;
        if (first > second) {
            min = second;
            max = first;
        } else if (first == second) {
            min = first;
            max = first;
        } else {
            min = first;
            max = second;
        }
        ;

        return "Sum of two integers:" + Sum + "\n" +
                "Difference of two integers:" + diff + "\n" +
                "Product of two integers:" + mul + "\n" +
                "Average of two integers:" + av + "\n" +
                "Distance of two integers:" + dis + "\n" +
                "Max integer:" + max + "\n" + "Min integer:" + min;


    }

}


