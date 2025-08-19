// 4. WAP to demonstrate method overloading with different return types.

public class MethodOverReturn {
    public int subtract(int a, int b) {
        System.out.println("subtract(int, int) called");
        return a - b;
    }
    public double subtract(double a, double b) {
        System.out.println("subtract(double, double) called");
        return a - b;
    }
    public static void main(String[] args) {
        MethodOverReturn mor = new MethodOverReturn();
        int resultInt = mor.subtract(10, 5);
        double resultDouble = mor.subtract(10.5, 5.2);
        System.out.println("Result of subtracting integers: " + resultInt);
        System.out.println("Result of subtracting doubles: " + resultDouble);
    }
}

// subtract(int, int) called
// subtract(double, double) called
// Result of subtracting integers: 5
// Result of subtracting doubles: 5.3