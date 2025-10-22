public class Task {
    public static void main(String[] args) {

        int coins = 467;
        // ----Do not change below lines. needed for testing---
        coins = args.length > 0 ? Integer.parseInt(args[0]) : coins;
        // -------------------------------------

        System.out.println("coins = " + coins);

        //Add your solution here
int dollars = coins / 100;
int RemCoint = coins % 100;
int quarters = RemCoint / 25;
int RemCoint1 = RemCoint % 25;
int dimes = RemCoint1 / 10;
int RemCoint2 = RemCoint1 % 10;
int nickels = RemCoint2 / 5;
int RemCoint3 = RemCoint2 % 5;
int cent = RemCoint3;
System.out.println("Dollars = " + dollars);
System.out.println("Quarters = " + quarters);
System.out.println("Dimes = " + dimes);
System.out.println("Nickels = " + nickels);
System.out.println("Cent = " + RemCoint3);
    }
}