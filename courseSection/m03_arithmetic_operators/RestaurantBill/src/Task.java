public class Task {
    public static void main(String[] args) {

        double bill = 50.0;
        double tipPercentage = 10;

        // ----Do not change below lines. needed for testing---
        bill = args.length > 0 ? Double.parseDouble(args[0]) : bill;
        tipPercentage = args.length > 0 ? Double.parseDouble(args[1]) : tipPercentage;
        //--------------------------------

        //Write your solution here
double tip = tipPercentage / 100 * bill;
double tax = bill * 0.05;
double totalBill = bill + tax + tip;
System.out.println("Bill = " + bill + "\ntax = " + tax + "\ntip = " + tip + "\ntotalBill = " + totalBill);
    }
}