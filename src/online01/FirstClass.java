package online01;

public class FirstClass {

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("Hello Java");
//        System.out.println("Hello Peace");

        //numbers
//        byte myByte = 20; // 1 byte <-128 .. +127>
//        short myShort = 5220; // 2 bytes <-32768 ... +32767>
//        int myInteger = 52200; // 4 betes <-2.1mlrd ... +2.1mlrd> DEFAULT
//        long myLong = 30000000000L; // 8 bytes <-1^53 ... +2^63>
//
//        float myFloat = 15.4987f; // 4 bytes <>.00000000
//        double myDouble = 15.4987; // 8 bytes <>.0000000000000000 DEFAULT
//
//        char myChar = 'q'; // 2 bytes -> ASCII, UTF
//        boolean myBooleanTrue = true; //2 bytes
//        boolean myBooleanFalse = false;
//
//        //!!!! NO PRIMITIVE !!!!
//        String myString = "Hello";
//
//        //Math-operation
//        //+,-,*,/
//
//        int a = 10;
//        int b = 3;
//        System.out.println(a / b);
//
//        String name = "Oleg";
//        int c = 45;
//        System.out.println(name + c); //конкатенация строк
//        System.out.println("Result = " + (a + b) + " > " + name);

//        int a = 70;

//        if (a > 100) {
//            System.out.println("All good");
//            System.out.println("a > 100");
//        }
//        else {
//            System.out.println("All bad");
//        }
//        if (a < 50) {
//            System.out.println("a < 50");
//        }
//        else if (a > 100) {
//        System.out.println("a > 100");
//        } else {
//            System.out.println("what wrong?");
//        }
//        operationWeekDay();
//        operationWeekDay();
//        operationWeekDay();
//        operation2Day();
//        operationWeekDay();
//        operationWeekDay();
//        welcomeUser("Misha", 48);
//        welcomeUser("Slava", 40);
//        welcomeUser("Olga", 35);

        int tempValue = sum(350, 150);
        System.out.println(tempValue);

        String tmp = returnWords("Hello","Java");
        System.out.println(tmp);
    }
    public static void operationWeekDay() {
        System.out.println("Drink coffee");
        System.out.println("Go out home");
        System.out.println("Go in office");
        System.out.println("Working...");
        System.out.println("Go to home");
        System.out.println("Sleep");
    }

    public static void operation2Day() {
        System.out.println("Drink coffee");
        System.out.println("Drink tea");
        System.out.println("Sleep");
    }

    public static void welcomeUser(String nameUser, int age) {
        System.out.println("Welcome " + nameUser + "!");
        System.out.println("Your age is " + age);
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static String returnWords(String word1, String word2) {
        return word1 + word2;
    }

}