package homework2;

public class HomeWork2App {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public static boolean taskOne(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void taskOne() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("********");
    }

    public static void taskTwo() {
        int a = 5;
        if (a >= 0) {
            System.out.println("Число " + a + " - положительное");
        } else {
            System.out.println("Число " + a + " - отрицательное");
        }

        System.out.println("********");
    }

    public static void taskThree() {
        System.out.println(taskThree(-5));
        System.out.println("********");
    }

    static boolean taskThree(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

        public static void taskFour() {

            for (int i = 0; i < 5; i++) {
                System.out.println("Привет");
            }
        }
    }



