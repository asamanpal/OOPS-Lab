// WAP to display how a static variable is initializzed and accessed
import java.util.Scanner;
public class Statin {
    static int result;
    void add(int a, int b) {

        result = a + b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        Statin obj = new Statin();
        obj.add(num1, num2);
        System.out.println("Sum: " + Statin.result);

    }
}