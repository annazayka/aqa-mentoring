package hw7.task2;

public class Test {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();

       // Метод в дочернем классе должен иметь ту же сигнатуру, что и метод в родительском классе.
        System.out.println(cat.testMethod1("11"));
       //ковариантные типы возврата
        System.out.println(cat.testMethod2("22"));
        // модификаторы доступа
        System.out.println(cat.testMethod3("33"));
        // эксепшены
        System.out.println(cat.testMethod4("33"));
    }
}
