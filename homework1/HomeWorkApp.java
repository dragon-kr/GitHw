package homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
//        printThreeWords();
//    }
//    public static void printThreeWords() {
//        System.out.println("Orange");
//        System.out.println("Banana");
//        System.out.println("Apple");
//
//        checkSumSign();
//    }
//       public static void checkSumSign() {
//        int a = 25;
//        int b = 30;
//           System.out.println(a + b);
//           int c = a + b;
//           System.out.println("c = " +c);
//           if (c >= 0) {
//               System.out.println("The sum is positive!");
//           }
//           else {
//               System.out.println("The sum is negative" );
//           }
//
//        printColor();
//    }
//        public static void printColor() {
//        int value = 25;
//        if (value <= 0) {
//            System.out.println("Red");
//        } else if (value <= 100) {
//            System.out.println("Yellow");
//        } else if (value >100) {
//            System.out.println("Green");
//        }
//
//        compareNumbers();
//    }
//    public static void compareNumbers() {
//        int a = 5;
//        int b = 15;
//        if (a >= b) {
//            System.out.println("a >= b");
//        } else {
//            System.out.println("a < b");
//        }

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 25;
        int b = 30;
        System.out.println(a + b);
        int c = a + b;
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("The sum is positive!");
        } else {
            System.out.println("The sum is negative");
        }
    }
    public static void printColor() {
        int value = 25;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }

}