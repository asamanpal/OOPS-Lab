// Java program to demonstrate method overloading with different number of parameters

public class MethodOverPara {
    public int multiply(int a, int b) {
        System.out.println("multiply(int, int) called");
        return a * b;
    }
    public int multiply(int a, int b, int c) {
        System.out.println("multiply(int, int, int) called");
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodOverPara mop = new MethodOverPara();
        int result1 = mop.multiply(2, 3);
        int result2 = mop.multiply(2, 3, 4);
        System.out.println("Result of multiply(2, 3): " + result1);
        System.out.println("Result of multiply(2, 3, 4): " + result2);
    }
}


// multiply(int, int) called
// multiply(int, int, int) called
// Result of multiply(2, 3): 6
// Result of multiply(2, 3, 4): 24