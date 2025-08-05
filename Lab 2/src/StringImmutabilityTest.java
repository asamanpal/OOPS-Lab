// WAP to check for the Immutability property of string object.

public class StringImmutabilityTest {
    public static void main(String[] args) {
        // Create a string
        String original = "Hello";

        // Try modifying the string using replace()
        String modified = original.replace('H', 'h');

        // Print original and modified strings
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Check if both references point to the same object
        if (original == modified) {
            System.out.println("Both strings are the same object.");
        } else {
            System.out.println("Different objects, string is immutable.");
        }
    }
}



//OUTPUT
//
//
//Original String: Hello
//Modified String: hello
//Different objects, string is immutable.