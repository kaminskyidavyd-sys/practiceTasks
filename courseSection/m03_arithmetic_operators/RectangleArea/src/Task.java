public class Task {
    public static void main(String[] args) {
        int width = 10;
        int height = 5;

        // ----Do not change below lines. needed for testing---
        width = args.length > 0 ? Integer.parseInt(args[0]) : width;
        height = args.length > 0 ? Integer.parseInt(args[1]) : height;
        // ------------------------------


        //Write your solution here
    int area = width * height;
    System.out.println("lest say width is " + width + " and height is " + height);
    System.out.println("output will be:");
    System.out.println("Area of rectangle=" + area);
    }
}