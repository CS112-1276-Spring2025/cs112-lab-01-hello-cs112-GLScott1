public class Main {
    public static void main(String[] args) {

        Duck duck1 = new Duck("Bart", 4, 2.1);

        System.out.println("Welcome to CS 112!");
        printStatement1();
        System.out.println(printStatement2());

        System.out.println(duck1.toString());
    }

    public static void printStatement1() {
        System.out.println("This is a void method");
    }

    public static String printStatement2() {
        String message = "This is a value-returning method";
        return message;
    }
}