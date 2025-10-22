public class Task {
    public static void main(String[] args) {
        int number = 123;

        // ----Do not change below lines. needed for testing---
        number = args.length > 0 ? Integer.parseInt(args[0]) : number;
        // ----------------------------------------------

        //Write your solution here
    int digits1 = number / 100;
    int digits2 = (number /10) % 10;
    int digits3 = number % 10;
    int sumDigit = digits1 + digits2 + digits3;
    System.out.println("Sum of the digits:" + sumDigit);

    }
}