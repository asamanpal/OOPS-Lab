// WAP  to check whether a string is palindrome or not


import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove case sensitivity and whitespace for fair comparison
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(processed).reverse().toString();

        // Check if palindrome
        if (processed.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}


//OUTPUT
//
//Enter a string: asamanpal
//The string is not a palindrome.

