public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        printStatement1();
        System.out.println(printStatement2());


    }

    public static void printStatement1() {
        System.out.println("This is a void method");
    }

    public static String printStatement2() {
        String message = "This is a value-returning method";
        return message;
    }
}