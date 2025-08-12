//  Write 4 different programs to check for different method prototypes.
//         a. without return without parameter
//         b. without return with parameters
//         c. with return without parameters
//         d. with return with parameters
import java.util.Scanner;


class Calc {
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc cal = new Calc();
        System.out.print("Enter two numbers for addition: ");
        int addA = sc.nextInt();
        int addB = sc.nextInt();
        cal.add(addA, addB);
        System.out.print("Enter two numbers for subtraction: ");
        int subA = sc.nextInt();
        int subB = sc.nextInt();
        cal.subtract(subA, subB);
        System.out.print("Enter two numbers for multiplication: ");
        int mulA = sc.nextInt();
        int mulB = sc.nextInt();
        System.out.println("Multiplication: " + cal.multiply(mulA, mulB));
        System.out.print("Enter two numbers for division: ");
        int divA = sc.nextInt();
        int divB = sc.nextInt();
        System.out.println("Division: " + cal.divide(divA, divB));
        sc.close();
    }
}