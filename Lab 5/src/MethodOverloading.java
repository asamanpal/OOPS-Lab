// Write a java program to demonstrate method overloading with two methods having different data types.

public class MethodOverloading {
    public int add(int a, int b) {
        System.out.println("add(int, int) called");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("add(double, double) called");
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int sumInt = mo.add(5, 10);
        double sumDouble = mo.add(5.5, 10.2);
        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}
