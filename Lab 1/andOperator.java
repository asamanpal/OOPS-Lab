import java.util.Scanner;

public class andOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int result = a & b;

        System.out.println("The result of " + a + " & " + b + " is: " + result);

        scanner.close();
    }
}
