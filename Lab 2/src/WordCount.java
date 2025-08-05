// WAP to count the number of words in a string.



import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Trim the string and check if it's empty
        if (input.trim().isEmpty()) {
            System.out.println("The number of words is: 0");
        } else {
            // Split the string by whitespace using regex
            String[] words = input.trim().split("\\s+");
            System.out.println("The number of words is: " + words.length);
        }

        scanner.close();
    }
}


//OUTPUT

//Enter a string: WHEN FRIENDSHIP FEELS LIKE LOVE
//The number of words is: 5


