package hw7;

public class OverVar {

    public static void main(String[] args)
    {
        fun("0hjhkjhkjhkh","yhjhkjhkjhku");
    }

    //varargs method with float datatype
    static void fun(float... x)
    {
        System.out.println("I am float varargs");
        int sum = 0;
        for (float i : x)
            sum += i;
        System.out.println( sum);
    }


    static void fun(int... x)
    {
        System.out.println("I am int varargs");
        int sum = 0;
        for (int i : x)
            sum += i;
        System.out.println( sum);

    }

    static void fun(double... x)
    {
        System.out.println("I am double varargs");
    }
    static void fun(String... x)
    {
        System.out.println("I am String varargs");
        String sum = "";
        for (String i : x)
            sum += i;
        System.out.println( sum);

    }
}
